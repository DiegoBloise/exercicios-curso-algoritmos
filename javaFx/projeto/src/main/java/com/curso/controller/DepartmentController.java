package com.curso.controller;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.curso.App;
import com.curso.model.Department;
import com.curso.service.DepartmentService;
import com.curso.util.Alerts;
import com.curso.util.Utils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class DepartmentController implements Initializable {

    private DepartmentService service;

    private ObservableList<Department> obsDepartments;

    @FXML
    private TableView<Department> tableViewDepartment;

    @FXML
    private TableColumn<Department, Integer> tableColumnId;

    @FXML
    private TableColumn<Department, String> tableColumnName;

    @FXML
    private Button btnNew;

    @FXML
    public void onBtnAction(ActionEvent event) {
        createDialogForm("department-form", Utils.currentStage(event));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));

        service = new DepartmentService();
        updateTableView();
    }

    public void updateTableView() {
        if (service == null) {
            String msg = "Service is null";
            System.out.println("Erro ao atualizar tabela: " + msg);
            Alerts.showAlert("Erro ao atualizar tabela", null, msg, AlertType.ERROR);
            throw new IllegalStateException(msg);
        }

        List<Department> departments = service.findAll();
        obsDepartments = FXCollections.observableArrayList(departments);
        tableViewDepartment.setItems(obsDepartments);
    }

    private void createDialogForm(String fxml, Stage parentStage) {
        try {
            Parent parent = App.loadFXML(fxml);

            Stage dialoStage = new Stage();
            dialoStage.setTitle("Enter Department data");
            dialoStage.setScene(new Scene(parent));
            dialoStage.setResizable(false);
            dialoStage.initOwner(parentStage);
            dialoStage.initModality(Modality.WINDOW_MODAL);
            dialoStage.showAndWait();
        } catch (IOException e) {
            System.out.println("Erro ao criar dialog: " + e.getMessage());
            Alerts.showAlert("Erro ao criar dialog", null, e.getMessage(), AlertType.ERROR);
        }
    }

    public void setDepartmentService(DepartmentService service) {
        this.service = service;
    }
}
