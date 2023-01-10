package com.finishing_school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finishing_school.model.Users;
import com.finishing_school.service.UserService;

@RestController
public class Controller {

	@Autowired
	UserService services;
	
	@GetMapping("kalpana")
	public String getString() {
		return 	"hello";
	}
	
	@GetMapping("/users")
	public List<Users> getAllUsers(){
		return services.getAllUsers();
	}
	
	@GetMapping("/users/{id}")
	public List<Users> getUserById(@PathVariable int id){
		return services.getById(id);
	}
	
	@GetMapping("/usersName/{name}")
	public List<Users> getUserByName(@PathVariable("name") String name){
		return services.getByName(name);
	}
	
}
