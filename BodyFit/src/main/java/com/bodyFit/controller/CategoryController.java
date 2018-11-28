package com.bodyFit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


import com.bodyFit.dao.CategoryDAO;
import com.bodyFit.model.Category;

@RestController
public class CategoryController {

@Autowired
private CategoryDAO categoryDAO;

@GetMapping("category/{id}")
public ResponseEntity<Category> getCategoryById(@PathVariable("id") Integer id) {
	Category category = categoryDAO.getCategoryById(id);
	return new ResponseEntity<Category>(category, HttpStatus.OK);
}

@GetMapping("category")
public ResponseEntity<List<Category>> getAllCategory(){
	List<Category> list = categoryDAO.getAllCategory();
	return new ResponseEntity<List<Category>>(list, HttpStatus.OK);
}

	
}
