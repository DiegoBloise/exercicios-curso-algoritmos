package com.curso.db.exceptions;

import com.curso.util.Alerts;

import javafx.scene.control.Alert.AlertType;

public class DbIntegrityException extends RuntimeException {

    public DbIntegrityException(String msg) {
        super(msg);
        System.out.println("Erro de integridade do banco de dados:" + msg);
        Alerts.showAlert("Erro de integridade do banco de dados", null, msg, AlertType.ERROR);
    }
}
