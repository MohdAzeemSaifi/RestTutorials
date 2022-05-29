package com.example.test.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.test.Entity.User;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	User user;
	List<User> users = new ArrayList<User>();
	
	public List<User> getUserDetails() {
		return users;
	}

	public void addUser(User user) {
		users.add(user);	
	}
	
	
	

}
