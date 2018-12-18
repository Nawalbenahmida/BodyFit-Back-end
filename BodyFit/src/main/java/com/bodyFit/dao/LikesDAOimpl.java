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
		String query ="SELECT * FROM likes INNER JOIN video ON likes.fkIdVideo = video.idVideo INNER JOIN users ON  likes.fkIdUser = users.idUser ";
		RowMapper<Likes> rowMapper = new LikesRowMapper();
		return  this.jdbcTemplate.query(query,  rowMapper);
	}

}
