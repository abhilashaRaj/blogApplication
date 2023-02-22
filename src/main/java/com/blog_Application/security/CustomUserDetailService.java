package com.blog_Application.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService implements UserDetailsService{

	@Override
	//for spring security
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//loading  user from database by username
		return null;
	}

}
