package com.projdn.projdn.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projdn.projdn.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User user = new User(1L, "Jose", "z@email.com", "339999", "123456");
				
				return ResponseEntity.ok(user);
	}
	
}
