package com.curso.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import com.curso.model.Department;
import com.curso.service.DepartmentService;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

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
    public void ontBtnAction() {

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
            throw new IllegalStateException("Service is null");
        }

        List<Department> departments = service.findAll();
        obsDepartments = FXCollections.observableArrayList(departments);
        tableViewDepartment.setItems(obsDepartments);
    }

    public void setDepartmentService(DepartmentService service) {
        this.service = service;
    }
}
