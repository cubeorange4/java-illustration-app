package com.example.illustrationApp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.illustrationApp.entity.Album;
import com.example.illustrationApp.entity.User;

public interface AlbumRepository extends JpaRepository<Album, Integer>{
	public Page<Album> findByUserOrderByCreatedAtDesc(User user, Pageable pageable);
}
