package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.payloads.CategoryDto;

public interface CategoryService {
	
	// 1. create
	CategoryDto createCategory(CategoryDto categoryDto);
	
	// 2. update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
	// 3. delete
	void deleteCategory(Integer categoryId);
	
	// 4. get
	CategoryDto getCategory(Integer CategoryId);
	
	// 5. getall
	List<CategoryDto> getCategories();
}
