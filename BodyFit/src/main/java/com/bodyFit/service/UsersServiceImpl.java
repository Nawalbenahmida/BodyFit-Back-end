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
		 if (usersDAO.usersExists(users.getMailUser())) {
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
	public Users getUsersByName(String nameUser) {
		Users obj = usersDAO.getUsersByName(nameUser);
		return obj;
	}

	@Override
	public boolean loginUsers(String mailUser, String passwordUser) {
		if(usersDAO.loginUsers( mailUser, passwordUser)){
			return true;
		}else {
			return false;
		}
		
	}
	
	

}
