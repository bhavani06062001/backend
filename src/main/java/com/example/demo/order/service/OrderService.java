package com.example.demo.order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.order.entity.order_entity;
import com.example.demo.order.repo.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    
    public List<order_entity> getAllOrders() {
        return orderRepository.findAll();
    }
    
    public Optional<order_entity> getOrderById(Long orderId) {
        return orderRepository.findById(orderId);
    }
    
    public order_entity createOrder(order_entity order) {
        return orderRepository.save(order);
    }
    
    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }
    
    public order_entity updateOrder(order_entity order) {
        return orderRepository.save(order);
    }
}
