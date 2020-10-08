package com.learn.mycart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.learn.mycart.entities.User;
import com.learn.mycart.repository.UserRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping(path="/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(path="/get")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/add")
	public void createUser(@RequestBody User user) {
		userRepository.save(user);
	}
	
}
