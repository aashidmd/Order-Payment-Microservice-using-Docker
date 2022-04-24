package com.micro.ps.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.ps.api.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {
    Payment findByOrderId(int orderId);
}

