package com.example.illustrationApp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.illustrationApp.entity.Album;
import com.example.illustrationApp.entity.AlbumInfo;

public interface AlbumInfoRepository extends JpaRepository<AlbumInfo, Integer>{
	public Page<AlbumInfo> findByAlbumOrderByCreatedAtDesc(Album album, Pageable pageable);
}
