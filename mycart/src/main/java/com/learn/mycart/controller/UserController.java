package com.learn.mycart.controller;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public void createUser(@RequestBody(required = false) User user) {
		userRepository.save(user);
	}
	@DeleteMapping(path = { "/{userId}" })
	public User deleteUser(@PathVariable("userId") long userId) {
		User user = userRepository.getOne(userId);
		userRepository.deleteById(userId);
		return user;
	}
	@PutMapping("/edit/{userId}")
	  public ResponseEntity<User> updateTutorial(@PathVariable("userId") long id, @RequestBody User user) {
	    Optional<User> userData = userRepository.findById(id);

	    if (userData.isPresent()) {
	      User _user = userData.get();
	      _user.setUserName(user.getUserName());
	      _user.setUserEmail(user.getUserEmail());
	      _user.setUserPassword(user.getUserPassword());
	      _user.setUserType(user.getUserType());
	      return new ResponseEntity<>(userRepository.save(_user), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	
}
