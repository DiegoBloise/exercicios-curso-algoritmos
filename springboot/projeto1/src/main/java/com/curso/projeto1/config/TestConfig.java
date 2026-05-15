package com.curso.projeto1.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.curso.projeto1.model.User;
import com.curso.projeto1.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Configuration
@Profile("test")
@RequiredArgsConstructor
public class TestConfig implements CommandLineRunner {

    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.saveAll(Arrays.asList(
                new User(
                        null,
                        "Maria",
                        "maria@mail.com",
                        "911111111",
                        "12345"),
                new User(
                        null,
                        "Alex Green",
                        "alex@mail.com",
                        "922222222",
                        "12345")));
    }
}
