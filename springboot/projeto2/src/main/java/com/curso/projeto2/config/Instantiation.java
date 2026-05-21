package com.curso.projeto2.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.curso.projeto2.domain.User;
import com.curso.projeto2.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
public class Instantiation implements CommandLineRunner {

    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();

        User user1 = new User("Maria Brown", "maria@gmail.com");
        User user2 = new User("Alex Green", "alex@gmail.com");
        User user3 = new User("Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(user1, user2, user3));
    }
}
