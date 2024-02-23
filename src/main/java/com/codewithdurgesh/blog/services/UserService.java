package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.payloads.UserDto;

public interface UserService {

	// 1. Normally - Creating User 
	UserDto createUser(UserDto user);
	
	// 2. Password encoding, assigning role and then creating user
	UserDto registerNewUser(UserDto userDto);
	
	UserDto updateUser(UserDto user, Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);
	
}
