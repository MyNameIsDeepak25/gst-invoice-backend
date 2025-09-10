package com.dipak.gst.gstinvoicebackend.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String hsnCode;

    private double price;

    private double gstRate; // e.g. 5, 12, 18
}
