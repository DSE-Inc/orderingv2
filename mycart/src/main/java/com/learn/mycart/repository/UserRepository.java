package com.learn.mycart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.mycart.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
