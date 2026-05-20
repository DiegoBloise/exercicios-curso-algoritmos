package com.curso.projeto2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.projeto2.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
