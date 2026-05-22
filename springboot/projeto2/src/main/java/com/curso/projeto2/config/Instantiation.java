package com.curso.projeto2.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.curso.projeto2.domain.Post;
import com.curso.projeto2.domain.User;
import com.curso.projeto2.dto.CommentDTO;
import com.curso.projeto2.mapper.UserMapper;
import com.curso.projeto2.repository.PostRepository;
import com.curso.projeto2.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Configuration
public class Instantiation implements CommandLineRunner {

    private final UserRepository userRepository;
    private final PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        postRepository.deleteAll();

        User user1 = new User("Maria Brown", "maria@gmail.com");
        User user2 = new User("Alex Green", "alex@gmail.com");
        User user3 = new User("Bob Grey", "bob@gmail.com");

        userRepository.saveAll(Arrays.asList(user1, user2, user3));

        Post post1 = new Post(
                LocalDate.parse("2018-02-21"),
                "Partiu viagem",
                "Vou viajar para São Paulo. Abraços!",
                user1);
        Post post2 = new Post(
                LocalDate.parse("2018-02-21"),
                "Bom dia",
                "Acordei feliz hoje!",
                user1);

        CommentDTO comment1 = new CommentDTO(
                "Boa viagem mano!",
                LocalDate.parse("2018-03-21"),
                UserMapper.toDTO(user2));
        CommentDTO comment2 = new CommentDTO(
                "Aproveite",
                LocalDate.parse("2018-03-22"),
                UserMapper.toDTO(user3));
        CommentDTO comment3 = new CommentDTO(
                "Tenha um ótimo dia!",
                LocalDate.parse("2018-03-23"),
                UserMapper.toDTO(user2));

        post1.getComments().addAll(Arrays.asList(comment1, comment2));
        post2.getComments().add(comment3);

        postRepository.saveAll(Arrays.asList(post1, post2));

        user1.getPosts().addAll(Arrays.asList(post1, post2));
        userRepository.save(user1);
    }
}
