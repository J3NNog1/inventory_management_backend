package com.jenncodes.InventoryManagement;

import com.jenncodes.InventoryManagement.model.Product;
import com.jenncodes.InventoryManagement.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class InventoryManagementApplication implements CommandLineRunner {

	private final ProductService productService;

	public InventoryManagementApplication(ProductService productService) {
		this.productService = productService;
	}

	public static void main(String[] args) {
		SpringApplication.run(InventoryManagementApplication.class, args);
	}

	@Override
	public void run(String... args) {
		System.out.println("Inventory Management Application is running...");

		// Example usage
		Product apple = new Product("Fresh Apples", 15, 10, 45, new Date(), new Date());
		productService.saveProduct(apple);

		// Retrieve the product
		Product retrievedProduct = productService.getProductByName("Fresh Apples");
		System.out.println("Retrieved Product: " + retrievedProduct);

		// Update the displayed quantity
		retrievedProduct.setDisplayedQuantity(20);
		productService.updateProduct(retrievedProduct);

		// Check if displayed quantity is within range
		retrievedProduct.checkDisplayQuantity();
	}


}
