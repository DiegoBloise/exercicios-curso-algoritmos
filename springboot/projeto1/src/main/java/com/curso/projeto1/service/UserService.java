package com.curso.projeto1.service;

import java.util.List;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.curso.projeto1.model.User;
import com.curso.projeto1.repository.UserRepository;
import com.curso.projeto1.resources.exceptions.DatabaseException;
import com.curso.projeto1.resources.exceptions.ResourceNotFoundException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findById(Long id) {
        return repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user) {
        return repository.save(user);
    }

    public User update(Long id, User updatedUser) {
        User existingUser = repository.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
        updateUser(existingUser, updatedUser);
        return repository.save(existingUser);
    }

    public void delete(Long id) {
        try {
            repository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new ResourceNotFoundException(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    private void updateUser(User existingUser, User updatedUser) {
        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPhone(updatedUser.getPhone());
    }
}
