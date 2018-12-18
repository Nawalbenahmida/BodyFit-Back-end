package com.bodyFit.dao;
import java.util.List;
import com.bodyFit.model.Category;

public interface CategoryDAO {
	List<Category> getAllCategory();
	Category getCategoryById(int idCategory);

}
