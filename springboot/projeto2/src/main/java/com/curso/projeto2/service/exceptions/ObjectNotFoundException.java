package com.curso.projeto2.service.exceptions;

public class ObjectNotFoundException extends RuntimeException {

    public ObjectNotFoundException(String id) {
        super("Object not found. Id: " + id);
    }

}
