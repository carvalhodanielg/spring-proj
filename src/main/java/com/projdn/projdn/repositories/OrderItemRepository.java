package com.projdn.projdn.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.projdn.projdn.entities.OrderItem;

public interface OrderItemRepository extends JpaRepositoryImplementation<OrderItem, Long> {
	
}
