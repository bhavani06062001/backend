package com.example.demo.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.order.entity.order_entity;

public interface OrderRepository extends JpaRepository<order_entity, Long> {
}
