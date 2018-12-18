package com.bodyFit.dao;

import java.util.List;

import com.bodyFit.model.Video;

public interface VideoDAO {
	List<Video> getAllVideo();
	Video getVideoById(int idVideo);
	List<Video> getVideoByIdFkCategory(int fkIdCategory);

}
