package com.curso.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.curso.model.Department;
import com.curso.util.Alerts;
import com.curso.util.Constraints;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable {

    private Department department;

    @FXML
    private TextField textFieldId;

    @FXML
    private TextField textFieldName;

    @FXML
    private Label labelNameError;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnCancel;

    @FXML
    public void onBtnSaveAction() {
        System.out.println("save action");
    }

    @FXML
    public void onBtnCancelAction() {
        System.out.println("cancel action");
    }

    public void updateFormData() {
        if (department == null) {
            String msg = "Department is null";
            System.out.println("Erro ao atualizar departamento: " + msg);
            Alerts.showAlert("Erro ao atualizar departamento", null, msg, AlertType.ERROR);
            throw new IllegalStateException(msg);
        }

        textFieldId.setText(String.valueOf(department.getId()));
        textFieldName.setText(String.valueOf(department.getName()));
    }

    private void initializeNodes() {
        Constraints.setTextFieldInteger(textFieldId);
        Constraints.setTextFieldMaxLength(textFieldName, 30);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeNodes();
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
