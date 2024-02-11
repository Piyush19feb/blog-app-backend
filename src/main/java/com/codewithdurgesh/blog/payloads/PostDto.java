package com.codewithdurgesh.blog.payloads;

import java.util.Date;

import com.codewithdurgesh.blog.entities.Category;
import com.codewithdurgesh.blog.entities.User;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostDto {

//	private int id;  // no need (automatic mil jata hai)
	
	private String title;
	
	private String content;
	
	private String imageName;
	
	private Date addedDate;
	
	private CategoryDto category;
	
	private UserDto user;
//	what about userId and categoryId??
//	=> we'll take/accept it from URL only
//	DTO mai hum sirf aisa hi data/field lete hai
//	jo hame client se leni hoti hai ya use deni hoti hai
}
