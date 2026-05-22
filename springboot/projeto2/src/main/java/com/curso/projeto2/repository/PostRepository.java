package com.curso.projeto2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.curso.projeto2.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
