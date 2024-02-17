package com.example.illustrationApp.form;

import org.springframework.web.multipart.MultipartFile;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class IllustrationRegisterForm {
	@NotBlank(message = "タイトルを入力してください")
	private String name;
	
	private MultipartFile imageFile;
	
	private String description;
	
	@NotBlank(message = "作成開始日を入力してください")
	private String startDate;
	
	@NotBlank(message = "作成完了日を入力してください")
	private String finishDate;
}
