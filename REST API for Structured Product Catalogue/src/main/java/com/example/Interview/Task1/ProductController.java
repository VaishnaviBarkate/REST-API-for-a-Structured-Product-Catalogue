package com.example.Interview.Task1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping("/add-product")
	public Product addProduct(@RequestBody Product product) {
		return productRepository.save(product);
	}
	
	@GetMapping("/{id}")
	public Product getProductById(@PathVariable Long id) {
		return productRepository.findById(id).orElse(null);
	}
	
	@PutMapping("/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
		product.setId(id);
		return productRepository.save(product);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id) {
		productRepository.deleteById(id);
	}
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	
	
}
