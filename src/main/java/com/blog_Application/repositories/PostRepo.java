package com.blog_Application.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog_Application.entities.Category;
import com.blog_Application.entities.Post;
import com.blog_Application.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer>{

	List<Post> findByCategory(Category category);
	List<Post> findByUser(User user);
	List<Post> findByTitleContaining(String title);
}
