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

    public User insert(User user) {
        return repository.save(user);
    }

    public User update(Long id, User updatedUser) {
        User existingUser = repository.getReferenceById(id);
        updateUser(existingUser, updatedUser);
        return repository.save(existingUser);
    }

    public void delete(User user) {
        repository.delete(user);
    }

    private void updateUser(User existingUser, User updatedUser) {
        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPhone(updatedUser.getPhone());
    }
}
