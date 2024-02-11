package com.projdn.projdn.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projdn.projdn.entities.Order;
import com.projdn.projdn.services.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

	@Autowired
	private OrderService orderService;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		
		List<Order> list = orderService.findAll();
		
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order user = orderService.findById(id);
		return ResponseEntity.ok(user);
	}
	
}
