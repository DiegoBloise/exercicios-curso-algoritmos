package com.curso.db.exceptions;

import com.curso.util.Alerts;

import javafx.scene.control.Alert.AlertType;

public class DbException extends RuntimeException {

    public DbException(String msg) {
        super(msg);
        System.out.println("Erro de conexão com o banco de dados:" + msg);
        Alerts.showAlert("Erro de conexão com o banco de dados", null, msg, AlertType.ERROR);
    }
}
