package com.codewithdurgesh.blog.payloads;

import org.hibernate.validator.constraints.Email;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;
	
//	@NotNull
	@NotEmpty
	@Size(min=4, message = "Username must be min of 4 characters")
	private String name;
	
	@Email(message = "Email address is not valid !!")
	private String email;
	
	@NotEmpty()
	@Size(min=3, max=10, message="Password must contain min 3 and max 10 characters")
	private String password;
	
	@NotEmpty
	private String about;
}
