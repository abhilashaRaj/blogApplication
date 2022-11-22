package com.blog_Application.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class UserDto {
	private int id;
	@NotEmpty
	@Size(min=4 , message="User must be of min characters 4")
	private String name;
	@NotEmpty
	@Size(min=3, max=10, message="password must be between 3 to 10 chars")
	private String password;
	@Email(message="email address is not valid")
	private String email;
	@NotEmpty
	private String about;
}
