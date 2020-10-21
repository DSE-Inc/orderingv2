package com.learn.mycart.service;

import java.util.List;

import javax.persistence.EntityExistsException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learn.mycart.entities.User;
import com.learn.mycart.repository.UserRepository;


@Service
public class UserService {
	
	private UserRepository repo;
	
	@Autowired UserService(UserRepository repo){
		this.repo = repo;
	}
	public User save(User user) {
		if(user.getUserId()!= null && repo.existsById(user.getUserId())) {
			throw new EntityExistsException("There is already a user with such Id in the database");
		}
		return repo.save(user);
	}
	public User update(User user) {
		if(user.getUserId()!= null && repo.existsById(user.getUserId())) {
			throw new EntityExistsException("There is already a user with such Id in the database");
		}
		return repo.save(user);
	}
	public List<User> findAll(){
		return repo.findAll();
	}
	
}
