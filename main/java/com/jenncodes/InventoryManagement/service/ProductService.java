package com.jenncodes.InventoryManagement.service;

import com.jenncodes.InventoryManagement.model.Product;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Data
@Service
public class ProductService {

    private List<Product> productList = new ArrayList<>();

    public void saveProduct(Product product) {
        // Logic to save the product (e.g., add to list, save to database)
        productList.add(product);
    }

    public Product getProductByName(String productName) {
        // Logic to retrieve the product by name (e.g., from list, from database)
        return productList.stream()
                .filter(product -> product.getName().equals(productName))
                .findFirst()
                .orElse(null);
    }

    public void updateProduct(Product product) {
        // Logic to update the product (e.g., update in list, update in database)
        int index = productList.indexOf(product);
        if (index != -1) {
            productList.set(index, product);
        }
    }

    public List<Product> getAllProducts() {
        return productList;
    }

}
