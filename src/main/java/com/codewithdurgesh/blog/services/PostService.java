package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.entities.Post;
import com.codewithdurgesh.blog.payloads.PostDto;
import com.codewithdurgesh.blog.payloads.PostResponse;


public interface PostService {

	// create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	// update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	// delete
	void deletePost(Integer postId);
	
	// getAllPost
//	List<PostDto> getAllPost(Integer pageNumber, Integer pageSize);
	PostResponse getAllPost(Integer pageNumber, Integer pageSize, String sortBy);
	
	
	// get single post => getPostById
	PostDto getPostById(Integer postId);
	
	// get All post by category
	List<PostDto> getPostsByCategory(Integer categoryId);
	
	// get all post by user
	List<PostDto> getPostsByUser(Integer userId);
	
	// get post by searching
	List<Post> searchPosts(String keyword);
	
}
