package com.example.test.Entity;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private int id;
	private String Name;
	private int age;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public User(int id, String name, int age, String address) {
		super();
		this.id = id;
		Name = name;
		this.age = age;
		this.address = address;
	}
	public User() {
		super();
	}
	

}
