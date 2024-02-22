package com.example.illustrationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.illustrationApp.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	public Role findByName(String name);
}
