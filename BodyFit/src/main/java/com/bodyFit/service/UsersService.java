package com.bodyFit.service;

import java.util.List;

import com.bodyFit.model.Users;

public interface UsersService {
	List<Users> getAllUsers();
	Users getUsersByName(String name_user);
	boolean addUsers(Users users);
   boolean loginUsers(String mail_user, String password_user);
}