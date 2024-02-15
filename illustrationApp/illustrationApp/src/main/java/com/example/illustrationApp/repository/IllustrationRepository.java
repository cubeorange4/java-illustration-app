package com.example.illustrationApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.illustrationApp.entity.Illustration;

public interface IllustrationRepository extends JpaRepository<Illustration, Integer>{

}
