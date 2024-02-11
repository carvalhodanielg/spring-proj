package com.projdn.projdn.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.projdn.projdn.entities.Product;


public interface ProductRepository extends JpaRepositoryImplementation<Product, Long> {
	
}
