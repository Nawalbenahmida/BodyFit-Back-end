package com.bodyFit.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UsersRowMapper implements RowMapper<Users> {

	@Override
	public Users mapRow(ResultSet row, int rowNum) throws SQLException {
		Users users = new Users();
		users.setId_user(row.getInt("id_user"));
		users.setName_user(row.getString("name_user"));
		users.setFirstName_user(row.getString("FirstName_user"));
		users.setMail_user(row.getString("Mail_user"));
		users.setPassword_user(row.getString("Password_user"));
		return users;
	}

}
