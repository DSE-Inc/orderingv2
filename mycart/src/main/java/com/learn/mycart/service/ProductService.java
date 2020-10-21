package com.learn.mycart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learn.mycart.entities.Product;
import com.learn.mycart.repository.ProductRepository;

@Service
@Transactional
public class ProductService {

	@Autowired
	ProductRepository repo;
	
	public List<Product> listAll(){
		return repo.findAll();
	}
}
