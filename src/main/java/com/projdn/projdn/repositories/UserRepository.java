package com.projdn.projdn.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.projdn.projdn.entities.User;

public interface UserRepository extends JpaRepositoryImplementation<User, Long> {
	
}
