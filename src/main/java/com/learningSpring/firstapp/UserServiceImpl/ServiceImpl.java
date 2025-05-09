package com.learningSpring.firstapp.UserServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningSpring.firstapp.entity.User;
import com.learningSpring.firstapp.exception.UserNotFoundException;
import com.learningSpring.firstapp.repository.UserRepo;
import com.learningSpring.firstapp.service.UserService;

@Service
public class ServiceImpl implements UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User createUser(User user) { 
		return userRepo.save(user);
	}
	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}
	@Override
	public User updateUser(String id, User user) {
		throw new UserNotFoundException("Incorrect id: ");
	}
	@Override
	public User deleteUser(String id) {
		User user=userRepo.findById(id).get();
		if(user != null) {
			userRepo.delete(user);
			return user;
		}
		
		throw new UserNotFoundException("Incorrect id: ");
	}
	
	
	/*
	 * List<User> al=new ArrayList<>();
	 * 
	 * @Override public User createUser(User user) { al.add(user); return user; }
	 * 
	 * @Override public List<User> getAllUser() { return al; }
	 * 
	 * @Override public User deleteUser(String id) { for(User u:al) {
	 * if(u.getId().equals(id)) { al.remove(u); return u; } } //return null; throw
	 * new UserNotFoundException("Invalid user id "+id); }
	 * 
	 * @Override public User updateUser(String id, User user) { for(User u:al) {
	 * if(u.getId().equals(id)) { u.setName(user.getName());
	 * u.setUserName(user.getUserName()); return u;} } //return null; throw new
	 * UserNotFoundException("user id " +id+ " not found"); }
	 */
	
}
