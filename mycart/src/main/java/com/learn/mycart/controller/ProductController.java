package com.learn.mycart.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
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
import com.learn.mycart.service.ProductService;

@RestController
@CrossOrigin(origins="http://localhost:4200")
@RequestMapping(path="product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductService service;
	
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
	@RequestMapping("/")
	public String viewHomePage(Model model) {
	    List<Product> listProducts = service.listAll();
	    model.addAttribute("listProducts", listProducts);
	     
	    return "index";
	}
	
}
