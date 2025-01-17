package com.cybersoft.Product_CRUD.Service;

import com.cybersoft.Product_CRUD.Entity.Product;
import com.cybersoft.Product_CRUD.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    public Optional<Product> findById (Long id) {
        return productRepository.findById(id);
    }
    public Product save(Product product) {
        return productRepository.save(product);
    }
    public void deleteById (Long id) {
        productRepository.deleteById(id);
    }
}
