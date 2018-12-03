package com.bodyFit.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



import com.bodyFit.model.Users;
import com.bodyFit.service.UsersService;

@RestController
public class UsersController {
	
	Logger logger = LoggerFactory.getLogger(UsersController.class);
	

	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("users/{name}")
	public ResponseEntity<Users> getUsersByName(@PathVariable("name") String name){
		Users users = usersService.getUsersByName(name);
		return new ResponseEntity<Users>(users, HttpStatus.OK);
	}
	
	@GetMapping("users")
	public ResponseEntity<List<Users>> getAllUsers() {
		List<Users> list = usersService.getAllUsers();
		logger.info("ça marche");
		return new ResponseEntity<List<Users>>(list, HttpStatus.OK);
		 
		
	}
	
	@PostMapping("user")
	public ResponseEntity<Void> addUsers(@RequestBody Users users){
		
		 boolean flag = usersService.addUsers(users);
         if (flag == false) {
     
 	   return new ResponseEntity<Void>( HttpStatus.CONFLICT);
         }
        return new ResponseEntity<Void>( HttpStatus.CREATED);	
	}
	
	@PostMapping("login")
	public ResponseEntity<Void> loginUsers(@RequestBody Users users){
		 boolean flag = usersService.loginUsers( users.getMail_user(), users.getPassword_user());
         if (flag == true) {
        	 return new ResponseEntity<Void>( HttpStatus.CREATED);
 	  
         }
        
        return new ResponseEntity<Void>( HttpStatus.CONFLICT);
	}
	

}