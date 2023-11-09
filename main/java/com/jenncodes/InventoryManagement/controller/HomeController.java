package com.jenncodes.InventoryManagement.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Welcome to Inventory Management";
    }
    @GetMapping("/secured")
    public String secured(){
        return "Welcome to our secured page";
    }
}
