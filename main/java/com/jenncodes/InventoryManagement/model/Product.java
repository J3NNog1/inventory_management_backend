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

    @Column(name="current_quantity")
    private int currentQuantity;

    @Column(name="min_treshold")
    private int minTreshold;

    @Column(name="max_treshold")
    private int maxTreshold;

    @Column(name="expiry_date")
    private Date expiryDate;

    @Column(name="markdown_date")
    private Date markdownDate;

}
