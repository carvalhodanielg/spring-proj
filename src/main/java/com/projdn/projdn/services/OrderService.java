package com.projdn.projdn.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projdn.projdn.entities.Order;
import com.projdn.projdn.entities.User;
import com.projdn.projdn.repositories.OrderRepository;
import com.projdn.projdn.repositories.UserRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	public Order findById(Long id) {

		Optional<Order> obj = orderRepository.findById(id);
		return obj.get();
	}

}
