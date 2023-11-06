package com.jenncodes.InventoryManagement.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


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

    @Column(name="current_stock")
    private int currentStock;

    @Column(name="min_stock_treshold")
    private int minStockTreshold;

    @Column(name="max_stock_treshold")
    private int maxStockTreshold;

    @Column(name="expiry_date")
    private Date expiryDate;

    @Column(name="markdown_date")
    private Date markdownDate;

}
