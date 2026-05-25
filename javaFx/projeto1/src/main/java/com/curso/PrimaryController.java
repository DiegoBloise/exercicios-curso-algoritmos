package com.curso;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;

public class PrimaryController {

    @FXML
    private void realizarLogin() throws IOException {
        Alerts.showAlert("Erro", null, "O usuário 'diego-dev@outlook.com' já está usando essa senha! Escolha outra senha...",
                AlertType.ERROR);
    }
}
