package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.Entity.User;
import com.example.test.Service.Service;

@RestController
public class ApiController {

	@Autowired
	Service service;
	
	@PostMapping("/AddUser")
	public void addUserDetails(@RequestBody User user) {
		service.addUser(user);
	}
	
	
	@GetMapping("/users")
	public List<User> getString() {
		return service.getUserDetails();
	}
	
	
}
