package com.example.illustrationApp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.illustrationApp.entity.Illustration;
import com.example.illustrationApp.entity.User;

public interface IllustrationRepository extends JpaRepository<Illustration, Integer>{
	public Page<Illustration> findByUserOrderByCreatedAtDesc(User user, Pageable pageable);
}
