package com.springdatajpa.springboot.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Product {

    @Id
    private Long id;

    private String sku;


    private String name;

    private String description;
    private BigDecimal price;
    private boolean active;
    private String imageUrl;
    private LocalDateTime dateCreated;
    private LocalDateTime lastUpdated;
}