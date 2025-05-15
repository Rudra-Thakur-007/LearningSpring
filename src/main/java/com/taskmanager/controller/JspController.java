package com.taskmanager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.taskmanager.entity.User;
import com.taskmanager.service.ServiceImpl;

@Controller
public class JspController {
	
	 @Autowired
		private ServiceImpl userService;
	 
		@RequestMapping("/home")
		public String home() {
			return "index";
		}
		
		@RequestMapping("/regis")
		public String register(){
			return "UserRegistration";
		}

	
	   @RequestMapping("/Registration")
	   public String ab() {
		    return "index";
	    }
	
	   @PostMapping("/register")
	   public String creatingUser(@RequestParam String id ,@RequestParam String name ,@RequestParam String userName ,@RequestParam String password) {
		 	User user=userService.creatingUser(id, name, userName, password);
		 	if(user!=null)System.out.println("Registered");
		 	return "redirect:/login";
	    }
	 
	   @RequestMapping("/login")
       public String login() { 
			return "login";
		}
		@PostMapping("/log")
	    public String logForm(@RequestParam String userName ,@RequestParam String password) {
		 	if(userService.findByUserNameAndPassword(userName, password)!=null)
		 	return "index";
		 	else return "redirect:/login";
	    }
	 
}
