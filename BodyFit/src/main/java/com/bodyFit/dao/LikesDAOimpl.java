package com.bodyFit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.transaction.annotation.Transactional;

import com.bodyFit.model.Likes;
import com.bodyFit.model.LikesRowMapper;

@Transactional
@Repository
public class LikesDAOimpl implements LikesDAO {
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public List<Likes> getAllLikes() {
		String query ="SELECT * FROM likes INNER JOIN video ON likes.fk_id_video = video.id_video INNER JOIN users ON  likes.fk_id_user = users.id_user ";
		RowMapper<Likes> rowMapper = new LikesRowMapper();
		return  this.jdbcTemplate.query(query,  rowMapper);
	}

}
