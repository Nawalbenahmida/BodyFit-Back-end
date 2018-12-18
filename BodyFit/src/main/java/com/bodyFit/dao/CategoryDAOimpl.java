package com.bodyFit.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bodyFit.model.Category;
import com.bodyFit.model.CategoryRowMapper;

@Transactional
@Repository
public class CategoryDAOimpl implements CategoryDAO{
	@Autowired
    private JdbcTemplate jdbcTemplate; 
	
	@Override
	public List<Category> getAllCategory() {
		String sql = "SELECT idCategory, nameCategory, classCategory, routingCategory FROM category";
		RowMapper<Category> rowMapper = new CategoryRowMapper();
		return this.jdbcTemplate.query(sql, rowMapper);
	}

	@Override
	public Category getCategoryById(int idCategory) {
		String sql = "SELECT idCategory, nameCategory, classCategory, routingCategory FROM category WHERE idCategory = ?";
		RowMapper<Category> rowMapper = new BeanPropertyRowMapper<Category>(Category.class);
		Category category = jdbcTemplate.queryForObject(sql,  rowMapper, idCategory);
		return category;
	}

	

}
