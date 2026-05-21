package com.curso.projeto2.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.curso.projeto2.domain.User;
import com.curso.projeto2.dto.UserDTO;
import com.curso.projeto2.mapper.UserMapper;
import com.curso.projeto2.repository.UserRepository;
import com.curso.projeto2.service.exceptions.ObjectNotFoundException;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository repository;

    public List<UserDTO> findAll() {
        return repository.findAll()
                .stream()
                .map(user -> UserMapper.toDTO(user))
                .toList();
    }

    public UserDTO findById(String id) {
        User user = repository.findById(id)
                .orElseThrow(() -> new ObjectNotFoundException(id));

        return UserMapper.toDTO(user);
    }

    public UserDTO insert(UserDTO dto) {
        User newUser = UserMapper.toEntity(dto);
        return UserMapper.toDTO(repository.insert(newUser));
    }
}