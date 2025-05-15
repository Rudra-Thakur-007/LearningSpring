package com.taskmanager;

import java.util.List;

import com.taskmanager.entity.User;

public interface ServiceUser {
	 
	 User createUser(User user);
	 
	    List<User> getAllUsers();
	    
	    User updateUser(String id, User user);
	    
	    User deleteUser(String id);
	    
		List<User> getUserByName(String name);
		
		User findByUserNameAndPassword(String userName,String password);
		
		User creatingUser(String id , String name , String userName , String password);
	

}
