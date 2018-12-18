package com.bodyFit.service;

import java.util.List;

import com.bodyFit.model.Users;

public interface UsersService {
	List<Users> getAllUsers();
	Users getUsersByName(String nameUser);
	boolean addUsers(Users users);
   boolean loginUsers(String mailUser, String passwordUser);
}
