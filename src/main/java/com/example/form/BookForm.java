package com.example.form;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BookForm {
	
	@NotBlank
	@Length(max = 30)
	private String title;
	
	@NotBlank
	private String body;
}
