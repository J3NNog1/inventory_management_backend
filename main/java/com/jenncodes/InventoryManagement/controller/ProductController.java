package com.jenncodes.InventoryManagement.controller;


import com.jenncodes.InventoryManagement.model.Product;
import com.jenncodes.InventoryManagement.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String getAllProducts(Model model) {
        List<Product> productList = productService.getAllProducts();
        model.addAttribute("products", productList);
        return "productsList"; //Thymeleaf template name (productsList.html)
    }

}
