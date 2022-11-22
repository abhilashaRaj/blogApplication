package com.blog_Application.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class CategoryDto {
	private Integer categoryId;
	@NotBlank
	@Size(min=3, message="Minimum size of Category Title is 3")
	private String categoryTitle;
	@NotBlank
	@Size(min=5, message="Minimum size of Description is 5")
	private String categoryDescription;
}
