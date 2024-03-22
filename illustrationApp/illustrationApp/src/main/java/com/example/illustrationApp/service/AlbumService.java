package com.example.illustrationApp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.illustrationApp.entity.Album;
import com.example.illustrationApp.entity.User;
import com.example.illustrationApp.form.AlbumRegisterForm;
import com.example.illustrationApp.repository.AlbumRepository;

@Service
public class AlbumService {
	private final AlbumRepository albumRepository;
	
	public AlbumService(AlbumRepository albumRepository) {
		this.albumRepository = albumRepository;
	}
	
	@Transactional
	public void create(AlbumRegisterForm albumRegisterForm, User user) {
		Album album = new Album();
		
		album.setName(albumRegisterForm.getName());
		album.setUser(user);
		
		albumRepository.save(album);
	}
}
