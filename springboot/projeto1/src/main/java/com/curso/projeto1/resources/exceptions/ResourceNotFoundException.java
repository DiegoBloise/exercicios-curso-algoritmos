package com.curso.projeto1.resources.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Long id) {
        super("Resource not found. Id: " + id);
    }
}
