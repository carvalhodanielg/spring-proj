package com.projdn.projdn.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projdn.projdn.entities.User;
import com.projdn.projdn.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(Long id) {

		Optional<User> obj = userRepository.findById(id);
		return obj.get();
	}

}
