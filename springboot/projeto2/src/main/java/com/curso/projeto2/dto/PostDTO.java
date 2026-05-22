package com.curso.projeto2.dto;

import java.time.LocalDate;

public record PostDTO(
        String id,
        LocalDate date,
        String title,
        String body,
        UserDTO author) {
}
