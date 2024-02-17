package com.example.illustrationApp.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.illustrationApp.entity.Illustration;
import com.example.illustrationApp.repository.IllustrationRepository;

@Controller
@RequestMapping("/illustration")
public class IllustrationController {
	private final IllustrationRepository illustrationRepository;
	
	public IllustrationController(IllustrationRepository illustrationRepository) {
		this.illustrationRepository = illustrationRepository;
	}
	
	@GetMapping
	public String index(@PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.ASC) Pageable pageable, Model model) {
		Page<Illustration> illustration = illustrationRepository.findAll(pageable);
		
		model.addAttribute("illustration", illustration);
		
		return "illustration/index";
	}
}
