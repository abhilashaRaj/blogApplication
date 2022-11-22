package com.blog_Application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog_Application.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>{

}
