package com.curso.projeto2.mapper;

import com.curso.projeto2.domain.User;
import com.curso.projeto2.dto.UserDTO;

public class UserMapper {

    public static UserDTO toDTO(User entity) {
        return new UserDTO(entity.getId(), entity.getName(), entity.getEmail());
    }

    public static User toEntity(UserDTO dto) {
        return new User(dto.id(), dto.name(), dto.email());
    }
}