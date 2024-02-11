package com.projdn.projdn.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.projdn.projdn.entities.Order;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long> {
	
}
