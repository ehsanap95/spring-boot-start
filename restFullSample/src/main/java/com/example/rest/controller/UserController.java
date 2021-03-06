package com.example.rest.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.example.rest.object.Person;
 
@RestController
public class UserController {
	
	@GetMapping("/getUserDetails")
	public String getUserDetail(@RequestHeader String name) {
		return "Get All Users" + name;
	}
	
	@PostMapping("/createUser")
	public Person createUser(@RequestHeader String name) {
		return new Person("1",name,"12");
	}
	
	@PutMapping("/updateUser")
	public Person updateUser(@RequestBody Person person) {
		return person;
	}
	
	@DeleteMapping("/deleteUser")
	public String deleteUser() {
		return "Delete User";
	}
	
}
