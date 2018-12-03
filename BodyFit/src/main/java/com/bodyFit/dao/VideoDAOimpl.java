package com.bodyFit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bodyFit.model.Video;
import com.bodyFit.model.VideoRowMapper;

@Transactional
@Repository
public class VideoDAOimpl implements VideoDAO {
	@Autowired
    private JdbcTemplate jdbcTemplate;

	@Override
	public List<Video> getAllVideo() {
		String query = "SELECT * FROM category INNER JOIN video ON category.id_category = video.fk_id_category";
		RowMapper<Video> rowMapper = new VideoRowMapper();
		return this.jdbcTemplate.query(query, rowMapper);
	}

	@Override
	public Video getVideoById(int id_video) {
		String sql = "SELECT id_video, name_video, link_video, fk_id_category FROM video WHERE id_video = ? ";
		RowMapper<Video> rowMapper = new BeanPropertyRowMapper<Video>(Video.class);
		Video video = jdbcTemplate.queryForObject(sql, rowMapper, id_video);
		return video;
	}

	@Override
	public List<Video> getVideoByIdFkCategory(int fk_id_category) {
		String sql = "SELECT id_video, name_video, link_video, fk_id_category FROM video WHERE fk_id_category = ? ";
		RowMapper<Video> rowMapper = new BeanPropertyRowMapper<Video>(Video.class);
		List<Video> list = jdbcTemplate.query(sql, rowMapper, fk_id_category);
		return list;
	}

}
