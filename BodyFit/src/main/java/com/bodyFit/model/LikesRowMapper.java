package com.bodyFit.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class LikesRowMapper implements RowMapper<Likes> {

	@Override
	public Likes mapRow(ResultSet row, int rowNum) throws SQLException {
	Likes likes = new Likes();
	Video video = new Video();
	Users users = new Users();
	likes.setFkIdUser(row.getInt("fkIdUser"));
	likes.setFkIdVideo(row.getInt("fkIdVideo"));
	video.setLinkVideo(row.getString("linkVideo"));
	video.setNameVideo(row.getString("nameVideo"));
	users.setMailUser(row.getString("mailUser"));
	likes.setUsers(users);
	likes.setVideo(video);
		return likes;
	}

}
