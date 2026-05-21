package com.curso.projeto2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.projeto2.dto.UserDTO;
import com.curso.projeto2.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository repository;

    public List<UserDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(user -> new UserDTO(
                        user.getId(),
                        user.getName(),
                        user.getEmail()))
                .toList();
    }
}