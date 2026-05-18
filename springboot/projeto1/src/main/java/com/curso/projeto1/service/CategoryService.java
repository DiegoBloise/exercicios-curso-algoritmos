package com.curso.projeto1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.projeto1.model.Category;
import com.curso.projeto1.repository.CategoryRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {

    private final CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Categoria não encontrada"));
    }
}
