package com.blog_Application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog_Application.entities.User;

public interface UserRepo extends JpaRepository<User ,Integer> {

}
