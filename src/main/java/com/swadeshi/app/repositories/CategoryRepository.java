package com.swadeshi.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.swadeshi.app.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>  {

	Optional<Category> findFirstByCatName(String catName);


	

}
