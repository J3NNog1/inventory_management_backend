package com.jenncodes.InventoryManagement.repository;

import com.jenncodes.InventoryManagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Add custom queries if needed
}

