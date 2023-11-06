package com.jenncodes.InventoryManagement.service;

import com.jenncodes.InventoryManagement.exception.ResourceNotFoundException;
import com.jenncodes.InventoryManagement.model.Product;
import com.jenncodes.InventoryManagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    // Add a new product
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    // Update an existing product
    public Product updateProduct(Long productId, Product updatedProduct) {
        Product existingProduct = productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));

        // Update the properties of the existing product with data from updatedProduct
        existingProduct.setName(updatedProduct.getName());
        existingProduct.setCurrentStock(updatedProduct.getCurrentStock());


        // Update other properties as needed

        return productRepository.save(existingProduct);
    }

    // Retrieve a product by ID
    public Product getProductById(Long productId) {
        return productRepository.findById(productId)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }
    //retrieve product by name
    public Object getProductByName(String productName) {
        return productRepository.findByName(productName)
                .orElseThrow(() -> new ResourceNotFoundException("Product not found"));
    }


    // Add more methods for business logic, e.g., checking stock levels, triggering notifications, etc.
}

