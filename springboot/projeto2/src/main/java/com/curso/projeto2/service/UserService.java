package com.curso.projeto2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.projeto2.domain.User;
import com.curso.projeto2.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }
}