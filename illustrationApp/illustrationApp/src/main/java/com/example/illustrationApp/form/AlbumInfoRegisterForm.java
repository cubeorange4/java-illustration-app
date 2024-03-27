package com.example.illustrationApp.form;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AlbumInfoRegisterForm {
	@NotNull
	private Integer illustrationId;
}
