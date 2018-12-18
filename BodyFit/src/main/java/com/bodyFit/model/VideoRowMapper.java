package com.bodyFit.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class VideoRowMapper implements RowMapper<Video>{

	@Override
	public Video mapRow(ResultSet row, int rowNum) throws SQLException {
		Video video = new Video();
		video.setIdVideo(row.getInt("idVideo"));
		video.setNameVideo(row.getString("nameVideo"));
		video.setLinkVideo(row.getString("linkVideo"));
		video.setBlockVideo(row.getString("blockVideo"));
		video.setClassVideo(row.getString("classVideo"));
		video.setFkIdCategory(row.getInt("fkIdCategory"));

		return video;
	}
}
