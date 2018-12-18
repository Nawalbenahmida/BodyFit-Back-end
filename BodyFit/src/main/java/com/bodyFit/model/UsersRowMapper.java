package com.bodyFit.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UsersRowMapper implements RowMapper<Users> {

	@Override
	public Users mapRow(ResultSet row, int rowNum) throws SQLException {
		Users users = new Users();
		users.setIdUser(row.getInt("idUser"));
		users.setNameUser(row.getString("nameUser"));
		users.setFirstNameUser(row.getString("FirstNameUser"));
		users.setMailUser(row.getString("MailUser"));
		users.setPasswordUser(row.getString("PasswordUser"));
		return users;
	}

}
