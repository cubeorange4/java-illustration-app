package com.example.illustrationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.illustrationApp.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	public User findByEmail(String email);
}
