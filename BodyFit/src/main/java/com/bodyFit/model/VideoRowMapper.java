package com.bodyFit.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class VideoRowMapper implements RowMapper<Video>{

	@Override
	public Video mapRow(ResultSet row, int rowNum) throws SQLException {
		Video video = new Video();
		Category category = new Category();
		video.setId_video(row.getInt("id_video"));
		video.setName_video(row.getString("name_video"));
		video.setLink_video(row.getString("link_video"));
		category.setId_category(row.getInt("id_category"));
		category.setName_category(row.getString("name_category"));
		video.setCategory(category);
		return video;
	}
}
