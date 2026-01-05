package com.example.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.example.entity.Product;
import com.example.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository repository;
    public ProductServiceImpl(ProductRepository repository) {
        this.repository = repository;
    }
    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }
    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        Product existing = getProductById(id);

        existing.setName(product.getName());
        existing.setDescription(product.getDescription());
        existing.setPrice(product.getPrice());

        return repository.save(existing);
    }

    @Override
    public void deleteProduct(Long id) {
        Product product = getProductById(id);
        repository.delete(product);
    }

	@Override
	public Product saveProduct1(Product product) {
		return null;
	}

	@Override
	public Product updateProduct1(Long id, Product product) {
		return null;
	}
}