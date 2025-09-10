package com.dipak.gst.gstinvoicebackend.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String gstin; // optional

    private String state;

    private String email;

    private String phone;
}
