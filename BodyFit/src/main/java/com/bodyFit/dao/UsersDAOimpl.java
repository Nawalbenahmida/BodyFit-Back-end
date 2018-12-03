package com.bodyFit.dao;


import java.security.MessageDigest;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bodyFit.model.Users;
import com.bodyFit.model.UsersRowMapper;


@Transactional
@Repository
public class UsersDAOimpl implements UsersDAO {
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public List<Users> getAllUsers() {
		String sql = "SELECT id_user, name_user, firstName_user, mail_user,  password_user FROM users";
		RowMapper<Users> rowMapper = new UsersRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public Users getUsersByName(String name_user) {
		String sql = "SELECT mail_user, id_user, name_user, firstName_user,  password_user FROM users WHERE name_user = ?";
		RowMapper<Users> rowMapper = new BeanPropertyRowMapper<Users>(Users.class);
		Users users = jdbcTemplate.queryForObject(sql, rowMapper, name_user);
		return users;
	}

	@Override
	public void addUsers(Users users) {
		String sql = "INSERT INTO users ( id_user, name_user, firstName_user, mail_user,  password_user) values (?, ?, ?, ?, ?)";
		 jdbcTemplate.update(sql, users.getId_user(), users.getName_user(), users.getFirstName_user(), users.getMail_user(), sha256(users.getPassword_user()));	
	}
	
	private String sha256(String password_user) {
	try {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(password_user.getBytes("UTF-8"));
		return new String(hash);
	} catch (Exception ex) {
		 throw new RuntimeException(ex);
	}
	
	}
	
	@Override
	public boolean usersExists(String mail_user) {
		String sql = "SELECT count(*) FROM users WHERE mail_user = ? ";
		int count = jdbcTemplate.queryForObject(sql, Integer.class, mail_user);
		if(count == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean loginUsers(String mail_user, String password_user ) {
		String sql = "SELECT count(*) FROM users WHERE mail_user = ? and  password_user = ?";
	    int count = jdbcTemplate.queryForObject(sql, Integer.class, mail_user, sha256(password_user));
		if(count == 0) {
			return false;
		} else {
			return true;
		}
	   
	}


	


}