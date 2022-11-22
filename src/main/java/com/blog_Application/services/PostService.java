package com.blog_Application.services;

import java.util.List;

import com.blog_Application.entities.Post;
import com.blog_Application.payloads.PostDto;

public interface PostService {
 
	//create
	PostDto createPost(PostDto postDto,Integer userId,Integer categoryId);
	
	// update
	PostDto updatePost(PostDto postDto, Integer postId);
	
	//delete
   void deletePost(Integer postId);
    // get All posts
   List<PostDto> getAllPost();
   
   //get single post
   PostDto getPostById(Integer postId);
   
   //get posts by Category
   List<PostDto> getPostsByCategory(Integer categoryId);
   
   //get posts by User
   List<PostDto> getPostsByUser(Integer userId);
   
   //search posts
   List<PostDto> searchPosts(String keyword);
}
