package com.example.illustrationApp.form;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class AlbumInfoRegisterForm {
	@NotBlank
	private Integer illustrationId;
}
