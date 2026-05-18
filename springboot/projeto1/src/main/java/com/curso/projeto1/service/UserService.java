package com.curso.projeto1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.projeto1.model.User;
import com.curso.projeto1.repository.UserRepository;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));
    }
}
