package com.learn.mycart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.mycart.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
