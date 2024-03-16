package com.example.illustrationApp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.illustrationApp.entity.Category;
import com.example.illustrationApp.entity.User;
import com.example.illustrationApp.form.CategoryRegisterForm;
import com.example.illustrationApp.repository.CategoryRepository;

@Service
public class CategoryService {
	private final CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	@Transactional
	public void create(CategoryRegisterForm categoryRegisterForm, User user) {
		Category category = new Category();
		
		category.setName(categoryRegisterForm.getName());
		category.setUser(user);
		
		categoryRepository.save(category);
	}
}
