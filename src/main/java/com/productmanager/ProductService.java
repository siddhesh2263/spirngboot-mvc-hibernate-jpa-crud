package com.productmanager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> allProducts() {
		return productRepository.findAll();
	}
	
	public void saveProduct(Product product) {
		productRepository.save(product);
	}
	
	public Product getProduct(Long id) {
		return productRepository.findById(id).get();
	}
	
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
	}

}
