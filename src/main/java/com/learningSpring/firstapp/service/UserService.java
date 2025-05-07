package com.learningSpring.firstapp.service;

import java.util.List;

import com.learningSpring.firstapp.entity.User;

import org.springframework.stereotype.Service;


@Service
public interface UserService {
	
	User createUser(User user);
	
	List<User> getAllUser();
	
	User updateUser(String id,User user);
	
	User deleteUser(String id);
}
