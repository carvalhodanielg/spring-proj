package com.projdn.projdn.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.projdn.projdn.entities.Category;


public interface CategoryRepository extends JpaRepositoryImplementation<Category, Long> {
	
}
