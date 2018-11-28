package com.bodyFit.dao;

import java.util.List;

import com.bodyFit.model.Video;

public interface VideoDAO {
	List<Video> getAllVideo();
	Video getVideoById(int id_video);
	List<Video> getVideoByIdFkCategory(int fk_id_category);

}
