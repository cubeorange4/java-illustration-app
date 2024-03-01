package com.example.illustrationApp.controller;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.illustrationApp.entity.Category;
import com.example.illustrationApp.entity.Illustration;
import com.example.illustrationApp.entity.User;
import com.example.illustrationApp.form.IllustrationRegisterForm;
import com.example.illustrationApp.repository.CategoryRepository;
import com.example.illustrationApp.repository.IllustrationRepository;
import com.example.illustrationApp.security.UserDetailsImpl;

@Controller
@RequestMapping("/illustration")
public class IllustrationController {
	private final IllustrationRepository illustrationRepository;
	private final CategoryRepository categoryRepository;
	
	public IllustrationController(IllustrationRepository illustrationRepository, CategoryRepository categoryRepository) {
		this.illustrationRepository = illustrationRepository;
		this.categoryRepository = categoryRepository;
	}
	
	@GetMapping
	public String index(@AuthenticationPrincipal UserDetailsImpl userDetailsImpl, @PageableDefault(page = 0, size = 10, sort = "id", direction = Direction.ASC) Pageable pageable, Model model) {
		User user = userDetailsImpl.getUser();
		Page<Illustration> illustration = illustrationRepository.findByUserOrderByCreatedAtDesc(user, pageable);
		
		model.addAttribute("illustration", illustration);
		
		return "illustration/index";
	}
	
	@GetMapping("/{id}")
	public String show(@PathVariable(name = "id") Integer id, Model model) {
		Illustration illustration = illustrationRepository.getReferenceById(id);
		
		model.addAttribute("illustration", illustration);
		
		return "illustration/show";
	}
	
	@GetMapping("/register")
	public String register(Model model) {
		List<Category> category = categoryRepository.findAll();
		
		model.addAttribute("illustrationEditForm", new IllustrationRegisterForm());
		model.addAttribute("category", category);
		
		return "illustration/register";
	}
}
