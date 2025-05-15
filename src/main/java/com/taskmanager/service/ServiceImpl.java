package com.taskmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskmanager.ServiceUser;
import com.taskmanager.repo.UserRepo;
import com.taskmanager.entity.User;
import com.taskmanager.exception.UserNotFdException;

@Service
public class ServiceImpl implements ServiceUser {
	
	
	@Autowired
	private UserRepo userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
    @Override
  	public User updateUser(String id, User user){
   		User user1 =userRepo.findById(id).get();
   		if(user!=null){
   			user1.setName(user.getName());
    		user1.setUserName(user.getUserName());
    		user1.setPassword(user.getPassword());
    		return userRepo.save(user1); 
    	}
    	throw new UserNotFdException("User ID " + id + " not found.");
    }

    @Override
    public User deleteUser(String id) {
    	User user=userRepo.findById(id).get();
            if (user != null) {
                userRepo.delete(user);
                return user;
            }
        throw new UserNotFdException("Incorrect user :"+id+" entered");
    }

    @Override
	public List<User> getUserByName(String name) {
		return userRepo.findByName(name);
	}

	@Override
	public User findByUserNameAndPassword(String userName, String password) {
		User b=userRepo.findByUserNameAndPassword(userName, password);
		if(b!=null)System.out.println("login");
	 	else System.out.println("Invalid");
		return b;
	}

	@Override
	public User creatingUser(String id, String name, String userName, String password) {
		User user=new User();
	 	user.setId(id);
	 	user.setName(name);
	 	user.setUserName(userName);
	 	user.setPassword(password);
	 	user=createUser(user);
		return user;
	}
    
	
	
	/*
	 * @Autowired private UserRepo userRepo;
	 * 
	 * @Override public User createUser(User user) { return userRepo.save(user); }
	 * 
	 * @Override public List<User> getAllUser() { return userRepo.findAll(); }
	 * 
	 * @Override public User updateUser(String id, User user) { User
	 * user1=userRepo.findById(id).orElse(null); if(user1 != null) {
	 * user1.setUserName(user.getUserName()); return userRepo.save(user1); } throw
	 * new UserNotFdException("kindly Enter a valid id for updation"); }
	 * 
	 * @Override public User deleteUser(String id) { User user =
	 * userRepo.findById(id).orElse(null); if (user != null) {
	 * userRepo.delete(user); return user; } throw new
	 * UserNotFdException("kindly Enter a valid id for deletion"); }
	 * 
	 * @Override public List<User> getUserByName(String name) {
	 * 
	 * return userRepo.findByName(name); }
	 */
	

}
