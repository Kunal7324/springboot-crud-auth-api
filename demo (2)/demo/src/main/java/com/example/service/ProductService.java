package com.example.service;

import java.util.List;

import com.example.entity.Product;

public interface ProductService {

    Product saveProduct(Product product);
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProduct(Long id, Product product);
    void deleteProduct(Long id);
	Product saveProduct1(Product product);
	Product updateProduct1(Long id, Product product);
}