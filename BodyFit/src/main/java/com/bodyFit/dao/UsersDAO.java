package com.bodyFit.dao;

import java.util.List;

import com.bodyFit.model.Users;

public interface UsersDAO {
	List<Users> getAllUsers();
	Users getUsersByName(String name_user);
	void addUsers(Users users);
	boolean loginUsers(String mail_user, String password_user);
	boolean usersExists(String mail_user);
//	boolean loginExists(String mail_user, String password_user);

}
