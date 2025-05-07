package com.learningSpring.firstapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learningSpring.firstapp.UserServiceImpl.ServiceImpl;
import com.learningSpring.firstapp.entity.User;
@RestController
public class UserController {
	
	@Autowired
	ServiceImpl userService;
	
	@PostMapping("/regis")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
	}
	
	@GetMapping("/all")
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
	
	@PutMapping("/update/{id}")
	public User updateUser(@PathVariable String id,@RequestBody User user) {
		return userService.updateUser(id, user);
	}

	@DeleteMapping("/delete/{id}")
	public User deleteUser(@PathVariable String id) {
		return userService.deleteUser(id);	
	}
}
