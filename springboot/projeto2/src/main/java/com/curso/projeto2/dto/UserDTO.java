package com.curso.projeto2.dto;

import java.util.List;

public record UserDTO(
        String id,
        String name,
        String email,
        List<PostDTO> posts) {
}
