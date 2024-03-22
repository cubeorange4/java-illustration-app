package com.example.illustrationApp.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AlbumRegisterForm {
	@NotBlank(message = "名前を入力してください")
	private String name;
}
