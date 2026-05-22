package com.curso.projeto2.dto;

import java.time.LocalDate;
import java.util.List;

public record PostDTO(
        String id,
        LocalDate date,
        String title,
        String body,
        UserDTO author,
        List<CommentDTO> comments) {
}
