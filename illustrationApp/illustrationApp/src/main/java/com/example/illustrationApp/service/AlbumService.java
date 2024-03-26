package com.example.illustrationApp.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.illustrationApp.entity.Album;
import com.example.illustrationApp.entity.AlbumInfo;
import com.example.illustrationApp.entity.Illustration;
import com.example.illustrationApp.entity.User;
import com.example.illustrationApp.form.AlbumInfoRegisterForm;
import com.example.illustrationApp.form.AlbumRegisterForm;
import com.example.illustrationApp.repository.AlbumInfoRepository;
import com.example.illustrationApp.repository.AlbumRepository;
import com.example.illustrationApp.repository.IllustrationRepository;

@Service
public class AlbumService {
	private final AlbumRepository albumRepository;
	private final AlbumInfoRepository albumInfoRepository;
	private final IllustrationRepository illustrationRepository;
	
	public AlbumService(AlbumRepository albumRepository, AlbumInfoRepository albumInfoRepository, IllustrationRepository illustrationRepository) {
		this.albumRepository = albumRepository;
		this.albumInfoRepository = albumInfoRepository;
		this.illustrationRepository = illustrationRepository;
	}
	
	@Transactional
	public void create(AlbumRegisterForm albumRegisterForm, User user) {
		Album album = new Album();
		
		album.setName(albumRegisterForm.getName());
		album.setUser(user);
		
		albumRepository.save(album);
	}
	
	@Transactional
	public void infoCreate(Album album, AlbumInfoRegisterForm albumInfoRegisterForm) {
		AlbumInfo albumInfo = new AlbumInfo();
		Illustration illustration = illustrationRepository.getReferenceById(albumInfoRegisterForm.getIllustrationId());
		
		albumInfo.setAlbum(album);
		albumInfo.setIllustration(illustration);
		
		albumInfoRepository.save(albumInfo);
	}
}
