package com.blog_Application.services.impl;

import java.util.List;

import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog_Application.exceptions.ResourceNotFoundException;
import com.blog_Application.entities.User;
import com.blog_Application.payloads.UserDto;
import com.blog_Application.repositories.UserRepo;
import com.blog_Application.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
    
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public UserDto createUser(UserDto userDto) {
		// TODO Auto-generated method stub
//		User user=this.dtoToUser(userDto);
//		User savedUser=this.userRepo.save(user);
		
		User newUser = new User();
		newUser.setName(userDto.getName());
		newUser.setPassword(userDto.getPassword());
		newUser.setAbout(userDto.getAbout());
		newUser.setEmail(userDto.getEmail());
		
		userRepo.save(newUser);
		return this.userToDto(newUser);
	}

	@Override
	public UserDto updateUser(UserDto userDto, Integer userId) {
		// TODO Auto-generated method stub
		User user=this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User", "Id" ,userId));
		user.setName(userDto.getName());
		user.setEmail(userDto.getEmail());
		user.setPassword(userDto.getPassword());
		user.setAbout(userDto.getAbout());
		User updatedUser=this.userRepo.save(user);
		UserDto userDto1=this.userToDto(updatedUser);
		return userDto1;
	}

	@Override
	public UserDto getUserById(Integer userId) {
		// TODO Auto-generated method stub
		User user =this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User", "Id", userId));
		return this.userToDto(user);
	}

	@Override
	public List<UserDto> getAllUsers() {
	    List<User>users=this.userRepo.findAll();
	    List<UserDto>userDtos=users.stream().map(user->this.userToDto(user)).collect(Collectors.toList());
		return userDtos;
	}

	@Override
	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		User user =this.userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User", "Id", userId));
		 this.userRepo.delete(user);

	}
	
	public User dtoToUser(UserDto userDto)
	{
		User user= this.modelMapper.map(userDto, User.class);
//		user.setId(userDto.getId());
//		user.setName(userDto.getName());
//		user.setAbout(userDto.getAbout());
//		user.setEmail(userDto.getEmail());
//		user.setPassword(userDto.getPassword());
		return user;
	}
	public UserDto userToDto(User user)
	{
		UserDto userDto= this.modelMapper.map(user,UserDto.class);
//		userDto.setId(user.getId());
//		userDto.setName(user.getName());
//		userDto.setEmail(user.getEmail());
//		userDto.setPassword(user.getPassword());
//		userDto.setAbout(user.getAbout());
		return userDto;
	}

	/*@Override
	public UserDto create(UserDto user) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
