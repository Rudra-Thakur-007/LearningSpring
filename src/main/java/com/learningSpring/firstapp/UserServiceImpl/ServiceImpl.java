package com.learningSpring.firstapp.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learningSpring.firstapp.entity.User;
import com.learningSpring.firstapp.exception.UserNotFoundException;
import com.learningSpring.firstapp.service.UserService;

@Service
public class ServiceImpl implements UserService{
	
	List<User> al=new ArrayList<>();
	@Override
	public User createUser(User user) {
		al.add(user);
		return user;
	}
	@Override
	public List<User> getAllUser() {
		return al;
	}
	
	@Override
	public User deleteUser(String id) {
		for(User u:al) {
			if(u.getId().equals(id)) {
				al.remove(u);
				return u;
			}
		}
		//return null;
		throw new UserNotFoundException("Invalid user id "+id);
	}
	
	@Override
	public User updateUser(String id, User user) {
		for(User u:al) {
			if(u.getId().equals(id)) {
				u.setName(user.getName());
				u.setUserName(user.getUserName());
				return u;}
		}
		//return null;
		throw new UserNotFoundException("user id " +id+ " not found");
	}
	
}
