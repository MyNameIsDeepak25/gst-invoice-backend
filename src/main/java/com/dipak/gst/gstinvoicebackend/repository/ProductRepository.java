package com.dipak.gst.gstinvoicebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipak.gst.gstinvoicebackend.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
