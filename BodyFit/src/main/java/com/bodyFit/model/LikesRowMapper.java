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
	likes.setFk_id_user(row.getInt("fk_id_user"));
	likes.setFk_id_video(row.getInt("fk_id_video"));
	video.setLink_video(row.getString("link_video"));
	video.setName_video(row.getString("name_video"));
	users.setMail_user(row.getString("mail_user"));
	likes.setUsers(users);
	likes.setVideo(video);
		return likes;
	}

}
