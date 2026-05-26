package com.curso.db.exceptions;

public class DbIntegrityException extends RuntimeException {

    public DbIntegrityException(String msg) {
        super(msg);
    }
}
