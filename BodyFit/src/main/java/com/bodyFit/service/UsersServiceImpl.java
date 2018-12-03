package com.bodyFit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bodyFit.dao.UsersDAO;
import com.bodyFit.model.Users;

@Service
public class UsersServiceImpl implements UsersService {
	@Autowired
	private UsersDAO usersDAO;

	@Override
	public  boolean addUsers(Users users) {
		 if (usersDAO.usersExists(users.getMail_user())) {
	          return false;
           } else {
	          usersDAO.addUsers(users);
	          return true;
           }
	}

	@Override
	public List<Users> getAllUsers() {
		return usersDAO.getAllUsers();
	}

	@Override
	public Users getUsersByName(String name_user) {
		Users obj = usersDAO.getUsersByName(name_user);
		return obj;
	}

	@Override
	public boolean loginUsers(String mail_user, String password_user) {
		if(usersDAO.loginUsers( mail_user, password_user)){
			return true;
		}else {
			return false;
		}
		
	}
	
	

}