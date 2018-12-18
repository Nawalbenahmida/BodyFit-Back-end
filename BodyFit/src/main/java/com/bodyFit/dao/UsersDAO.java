package com.bodyFit.dao;

import java.util.List;

import com.bodyFit.model.Users;

public interface UsersDAO {
	List<Users> getAllUsers();
	Users getUsersByName(String nameUser);
	void addUsers(Users users);
	boolean loginUsers(String mailUser, String passwordUser);
	boolean usersExists(String mailUser);


}
