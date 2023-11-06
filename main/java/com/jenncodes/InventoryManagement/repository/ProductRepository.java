package com.jenncodes.InventoryManagement.repository;

import com.jenncodes.InventoryManagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Object> findByName(String productName);

    // Add custom queries if needed
}

