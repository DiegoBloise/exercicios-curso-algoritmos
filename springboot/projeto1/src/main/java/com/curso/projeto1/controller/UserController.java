package com.curso.projeto1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.curso.projeto1.model.User;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public ResponseEntity<User> findAll() {
        return ResponseEntity.ok(new User(1L, "Maria", "maria@mail.com", "999999999", "12345"));
    }
}
