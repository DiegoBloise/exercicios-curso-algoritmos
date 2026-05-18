package com.curso.projeto1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.projeto1.model.Product;
import com.curso.projeto1.repository.ProductRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Produto não encontrado"));
    }
}
