package com.jenncodes.InventoryManagement.model;

import com.jenncodes.InventoryManagement.utility.NotificationService;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import java.sql.*;
import java.text.SimpleDateFormat;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="id")
    private long id;

    @Column(name="name")
    private String name;

    @Column(name="current_quantity")
    private int currentQuantity;

    @Column(name="min_treshold")
    private int minThreshold;

    @Column(name="max_treshold")
    private int maxThreshold;

    @Column(name="expiry_date")
    private Date expiryDate;

    @Column(name="markdown_date")
    private Date markdownDate;

    @Column(name="displayed_quantity")
    private int displayedQuantity;

    public Product(String name, int currentQuantity, int minThreshold, int maxThreshold, Date expiryDate, Date markdownDate) {
        this.name = name;
        this.currentQuantity = currentQuantity;
        this.minThreshold = minThreshold;
        this.maxThreshold = maxThreshold;
        this.expiryDate = expiryDate;
        this.markdownDate = markdownDate;
        this.displayedQuantity = 5;  // Initialize displayed quantity to 5
    }
    public void checkDisplayQuantity() {
        if (displayedQuantity < minThreshold || displayedQuantity > maxThreshold) {
            System.out.println("Display quantity is out of range for " + name + ". Displayed quantity: " + displayedQuantity);
        }
    }


}
