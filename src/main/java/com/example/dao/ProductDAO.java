package com.example.dao;

import com.example.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ProductDAO extends MongoRepository<Product, Long> {

	public List<Product> findByProductNameStartingWithIgnoreCase(String productName);

}
