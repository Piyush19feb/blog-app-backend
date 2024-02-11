package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.entities.Post;
import com.codewithdurgesh.blog.payloads.PostDto;


public interface PostService {

	// create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);
	
	// update
	Post updatePost(PostDto postDto, Integer postId);
	
	// delete
	void deletePost(Integer postId);
	
	// getAllPost
	List<Post> getAllPost();
	
	// get single post => getPostById
	Post getPostById(Integer postId);
	
	// get All post by category
	List<Post> getPostsByCategory(Integer categoryId);
	
	// get all post by user
	List<Post> getPostsByUser(Integer userId);
	
	// get post by searching
	List<Post> searchPosts(String keyword);
	
}
