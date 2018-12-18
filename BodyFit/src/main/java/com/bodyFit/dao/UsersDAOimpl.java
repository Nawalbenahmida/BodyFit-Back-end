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
		String sql = "SELECT idUser, nameUser, firstNameUser, mailUser,  passwordUser FROM users";
		RowMapper<Users> rowMapper = new UsersRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public Users getUsersByName(String nameUser) {
		String sql = "SELECT mailUser, idUser, nameUser, firstNameUser,  passwordUser FROM users WHERE nameUser = ?";
		RowMapper<Users> rowMapper = new BeanPropertyRowMapper<Users>(Users.class);
		Users users = jdbcTemplate.queryForObject(sql, rowMapper, nameUser);
		return users;
	}

	@Override
	public void addUsers(Users users) {
		String sql = "INSERT INTO users (nameUser, firstNameUser, mailUser,  passwordUser) values ( ?, ?, ?, ?)";
		 jdbcTemplate.update(sql, users.getNameUser(), users.getFirstNameUser(), users.getMailUser(), sha256(users.getPasswordUser()));	
	}
	
	private String sha256(String passwordUser) {
	try {
		MessageDigest digest = MessageDigest.getInstance("SHA-256");
		byte[] hash = digest.digest(passwordUser.getBytes("UTF-8"));
		return new String(hash);
	} catch (Exception ex) {
		 throw new RuntimeException(ex);
	}
	
	}
	
	@Override
	public boolean usersExists(String mailUser) {
		String sql = "SELECT count(*) FROM users WHERE mailUser = ? ";
		int count = jdbcTemplate.queryForObject(sql, Integer.class, mailUser);
		if(count == 0) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public boolean loginUsers(String mailUser, String passwordUser ) {
		String sql = "SELECT count(*) FROM users WHERE mail_user = ? and  password_user = ?";
	    int count = jdbcTemplate.queryForObject(sql, Integer.class, mailUser, sha256(passwordUser));
		if(count == 0) {
			return false;
		} else {
			return true;
		}
	   
	}


	


}
