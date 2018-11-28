package com.bodyFit.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class CategoryRowMapper implements RowMapper<Category> {

	@Override
	public Category mapRow(ResultSet row, int rowNum) throws SQLException {
		Category category = new Category();
		category.setId_category(row.getInt("id_category"));
		category.setName_category(row.getString("name_category"));
		return category;
	}

}
