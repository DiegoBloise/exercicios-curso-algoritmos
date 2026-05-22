package com.curso.projeto2.domain;

import java.io.Serializable;
import java.time.LocalDate;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Document
public class Post implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    private String id;

    private LocalDate date;

    private String title;

    private String body;

    private User author;
}