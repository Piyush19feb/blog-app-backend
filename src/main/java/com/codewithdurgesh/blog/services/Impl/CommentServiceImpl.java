package com.codewithdurgesh.blog.services.Impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codewithdurgesh.blog.entities.Comment;
import com.codewithdurgesh.blog.entities.Post;
import com.codewithdurgesh.blog.exceptions.ResourceNotFoundException;
import com.codewithdurgesh.blog.payloads.CommentDto;
import com.codewithdurgesh.blog.repositories.CommentRepo;
import com.codewithdurgesh.blog.repositories.PostRepo;
import com.codewithdurgesh.blog.services.CommentService;

@Service
public class CommentServiceImpl implements CommentService {
	
	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private CommentRepo commetRepo;

	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CommentDto createComment(CommentDto commentDto, Integer postId) {
		Post post = this.postRepo.findById(postId).orElseThrow(()-> new ResourceNotFoundException("Post", "post id", postId));
		Comment comment = this.modelMapper.map(commentDto, Comment.class);
		
		comment.setPost(post);
		Comment savedComment = this.commetRepo.save(comment);
		return this.modelMapper.map(savedComment, CommentDto.class);
	}

	@Override
	public void deleteComment(Integer commentId) {
		Comment comment = this.commetRepo.findById(commentId).orElseThrow(()-> new ResourceNotFoundException("Comment", "comment id", commentId));
		this.commetRepo.delete(comment);
	}

}
