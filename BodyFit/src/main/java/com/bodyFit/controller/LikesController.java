package com.bodyFit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bodyFit.dao.LikesDAO;
import com.bodyFit.model.Likes;

@RestController
public class LikesController {
	@Autowired
	private LikesDAO likesDAO;
	
	@GetMapping("like")
	public ResponseEntity<List<Likes>> getAllLikes(){
		List<Likes> list = likesDAO.getAllLikes();
		return new ResponseEntity<List<Likes>>(list, HttpStatus.OK);
	}

}
