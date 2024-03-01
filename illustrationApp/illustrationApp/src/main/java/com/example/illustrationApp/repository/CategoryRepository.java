package com.example.illustrationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.illustrationApp.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
