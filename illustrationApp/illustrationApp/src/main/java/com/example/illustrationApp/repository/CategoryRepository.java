package com.example.illustrationApp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.illustrationApp.entity.Category;
import com.example.illustrationApp.entity.User;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
	public Page<Category> findByUserOrderByCreatedAtDesc(User user, Pageable pageable);
}
