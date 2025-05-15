package com.taskmanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.taskmanager.entity.User;
import com.taskmanager.service.ServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	public ServiceImpl userService;
	
	@PostMapping("/register")
	public ResponseEntity<User> createUser(@RequestBody User user) {
		    user =userService.createUser(user);
		    return new ResponseEntity<User>(user,HttpStatus.ACCEPTED);
	                                                        }
		    @GetMapping("/all")
			public List<User> getAllUser(){
				return userService.getAllUsers();
			}

			@PutMapping("/update/{id}")
			public User updateUser(@PathVariable String id,@RequestBody User user) {
				return userService.updateUser(id, user);
			}

			@DeleteMapping("/delete/{id}")
			public User deleteUser(@PathVariable String id) {
				return userService.deleteUser(id);		
			}
			@GetMapping("/find")
			public List<User> getUserByName(@RequestParam String name){
				return userService.getUserByName(name);
			}

}
