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

    public Post(LocalDate date, String title, String body, User author) {
        this.date = date;
        this.title = title;
        this.body = body;
        this.author = author;
    }
}