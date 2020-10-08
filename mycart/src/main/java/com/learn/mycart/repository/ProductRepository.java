package com.learn.mycart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.mycart.entities.Product;



public interface ProductRepository extends JpaRepository<Product, Long>{

}
