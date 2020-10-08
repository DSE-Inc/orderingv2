package com.learn.mycart.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.mycart.entities.Product;
import com.learn.mycart.repository.ProductRepository;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(path="product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/get")
	public List<Product> getProduct(){
		return productRepository.findAll();
	}
	@PostMapping("/add")
	public void createProduct(@RequestBody Product product) throws IOException {
		productRepository.save(product);
	}
	@PutMapping("/update")
	public void updateProduct(@RequestBody Product product) throws IOException {
		productRepository.save(product);
	}
	//@DeleteMapping("/{id}")
	
}
