package com.example.illustrationApp.form;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AlbumEditForm {
	@NotNull
	private Integer id;
}
