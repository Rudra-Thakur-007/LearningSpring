package com.learningSpring.firstapp.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homedemo {
	
	
	
	@RequestMapping("/aaa")
	public String getName() {
		return "Rudra Thakur";
	}
	
	@PostMapping("/name")
	public String getId() {
		return "this is my first API call through Post";
	}
	
	@GetMapping("/num")
	public String getNumber(@RequestParam("un") String un) {
		return un;
	}
	
	@GetMapping("/xyz/{id}")
	public String geTid(@PathVariable("id") String un) {
	     return ""+un;
	}
	
	@GetMapping("/link/{id}")
	public String myId(@PathVariable String id) {
	     return ""+id;
	}
	
	@GetMapping("/filter1/{id}")
	public String applyFilter(@PathVariable String id) {
		List<String> li=new ArrayList<>();
		li.add("1"); 	li.add("2");	li.add("3");
		li.add("4");	li.add("5");	li.add("6");
		li.add("7");	li.add("8");	li.add("9");
		li.add("10");
		for(String s:li) {
			if(s.equals(id)) return s;
		}
		return "";
	}
	@GetMapping("/filter2")
	public String getUsers() {
		List<String> li=new ArrayList<>();
		li.add("1");	li.add("2");	li.add("3");
		li.add("4");	li.add("5");	li.add("6");
		li.add("7");	li.add("8");	li.add("9");
		li.add("10");
		
		return li.toString();
	}
	
	@GetMapping("/filter3")
	public String getUser(@RequestParam(required = false) String id) {
		List<String> li=new ArrayList<>();
		li.add("1");	li.add("2");	li.add("3");
		li.add("4");	li.add("5");	li.add("6");
		li.add("7");	li.add("8");	li.add("9");
		li.add("10");
		
		if(id!=null) {
			for(String s:li) {
				if(s.equals(id)) return s;	
			}
			return "";
		}
		return li.toString();
	}
	

	
	
}
