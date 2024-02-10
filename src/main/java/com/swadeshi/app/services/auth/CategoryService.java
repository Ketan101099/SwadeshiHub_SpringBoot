package com.swadeshi.app.services.auth;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swadeshi.app.exceptions.UserServiceException;
import com.swadeshi.app.model.Category;
import com.swadeshi.app.model.State;
import com.swadeshi.app.repositories.CategoryRepository;



@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    // Save or update a category entity
    public Category saveOrUpdateCategory(Category category) {
        // Set the add_date if it's not provided
    	Optional<Category> iscategory = categoryRepository.findFirstByCatName(category.getCat_name());
    	if(iscategory.isEmpty()) {
    		
    	
        if (category.getAdd_date() == null) {
            category.setAdd_date(LocalDate.now());
        }
    	
        // Always set the upd_date to the current date
        category.setUpd_date(LocalDate.now());

        return categoryRepository.save(category);
    	}
    	else {
			throw new UserServiceException("Category already exist");
		}
    }
	

    // Get all categories
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Get a category by ID
    public Optional<Category> getCategoryById(int categoryId) {
        return categoryRepository.findById(categoryId);
    }

    // Delete a category by ID
 
    public void deleteCategoryById(int subCategoryId) {
        categoryRepository.deleteById(subCategoryId);
        }
    
    public Category updateCategory(Category category) {
        // Set the add_date if it's not provided
        if (category.getAdd_date() == null) {
            category.setAdd_date(LocalDate.now());
        }

        // Always set the upd_date to the current date
        category.setUpd_date(LocalDate.now());

        return categoryRepository.save(category);
    }
  
}
