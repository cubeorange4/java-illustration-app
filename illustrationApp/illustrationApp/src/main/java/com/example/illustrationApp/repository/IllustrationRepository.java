package com.example.illustrationApp.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.illustrationApp.entity.Category;
import com.example.illustrationApp.entity.Illustration;
import com.example.illustrationApp.entity.User;

public interface IllustrationRepository extends JpaRepository<Illustration, Integer>{
	public Page<Illustration> findByUserOrderByCreatedAtDesc(User user, Pageable pageable);
	public List<Illustration> findByCategoryA(Category Category);
}
