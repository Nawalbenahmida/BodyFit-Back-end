package com.bodyFit.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CategoryRowMapper implements RowMapper<Category> {

	@Override
	public Category mapRow(ResultSet row, int rowNum) throws SQLException {
		Category category = new Category();
		category.setIdCategory(row.getInt("idCategory"));
		category.setNameCategory(row.getString("nameCategory"));
		category.setClassCategory(row.getString("classCategory"));
		category.setRoutingCategory(row.getString("routingCategory"));
		return category;
	}

}
