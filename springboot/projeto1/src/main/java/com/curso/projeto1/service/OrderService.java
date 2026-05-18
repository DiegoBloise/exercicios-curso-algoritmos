package com.curso.projeto1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.projeto1.model.Order;
import com.curso.projeto1.repository.OrderRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Pedido não encontrado"));
    }
}
