package com.bodyFit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.bodyFit.dao.VideoDAO;
import com.bodyFit.model.Video;

@RestController
public class VideoController {
	@Autowired
	private VideoDAO videoDAO;
	
	@GetMapping("video/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<Video> getVideoById(@PathVariable("id") Integer id) {
		Video video = videoDAO.getVideoById(id);
		return new ResponseEntity<Video>(video, HttpStatus.OK);
	}
	
	@GetMapping("video/category/{id}")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<List<Video>> getVideoByIdFkCategory(@PathVariable("id") Integer id) {
		List<Video> list = videoDAO.getVideoByIdFkCategory(id);
		return new ResponseEntity<List<Video>>(list, HttpStatus.OK);
	}
	
	@GetMapping("video")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<List<Video>> getAllVideo(){
		List<Video> list = videoDAO.getAllVideo();
		return new ResponseEntity<List<Video>>(list, HttpStatus.OK);
	}

}
