package com.dipak.gst.gstinvoicebackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipak.gst.gstinvoicebackend.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
