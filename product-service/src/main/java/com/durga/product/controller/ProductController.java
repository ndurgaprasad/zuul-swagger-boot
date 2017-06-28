package com.durga.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.durga.product.model.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	
	@GetMapping("/{id}")
	public Product getProduct(@PathVariable String id) {
		return new Product(id, "swagger-product");
	}
}
