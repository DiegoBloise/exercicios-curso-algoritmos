package com.curso.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import com.curso.listeners.DataChangeListener;
import com.curso.model.Department;
import com.curso.model.Seller;
import com.curso.model.exceptions.ValidationException;
import com.curso.service.DepartmentService;
import com.curso.service.SellerService;
import com.curso.util.Alerts;
import com.curso.util.Constraints;
import com.curso.util.Utils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.util.Callback;

public class SellerFormController implements Initializable {

    private Seller seller;

    private SellerService sellerService;

    private DepartmentService departmentService;

    private List<DataChangeListener> dataChangeListeners = new ArrayList<>();

    private ObservableList<Department> obsDepartments;

    @FXML
    private TextField textFieldId;

    @FXML
    private TextField textFieldName;

    @FXML
    private TextField textFieldEmail;

    @FXML
    private DatePicker datePickerBirthDate;

    @FXML
    private TextField textFieldBaseSalary;

    @FXML
    private ComboBox<Department> comboBoxDepartment;

    @FXML
    private Label labelErrorName;

    @FXML
    private Label labelErrorEmail;

    @FXML
    private Label labelErrorBirthDate;

    @FXML
    private Label labelErrorBaseSalary;

    @FXML
    private Button btnSave;

    @FXML
    private Button btnCancel;

    @FXML
    public void onBtnSaveAction(ActionEvent event) {
        try {
            seller = getFormData();
            sellerService.saveOrUpdate(seller);
            notifyDataChangeListeners();
            Utils.currentStage(event).close();
        } catch (ValidationException e) {
            setErrorMessages(e.getErrors());
        }
    }

    @FXML
    public void onBtnCancelAction(ActionEvent event) {
        Utils.currentStage(event).close();
    }

    public void subscribeDataChangeListener(DataChangeListener listener) {
        dataChangeListeners.add(listener);
    }

    public void notifyDataChangeListeners() {
        dataChangeListeners.forEach(DataChangeListener::onDataChanged);
    }

    private Seller getFormData() throws ValidationException {
        seller = new Seller();

        ValidationException exception = new ValidationException("Validation error");

        seller.setId(Utils.tryParseToInt(textFieldId.getText()));

        if (textFieldName.getText() == null || textFieldName.getText().trim().equals("")) {
            exception.addError("name", "Field name can't be empty.");
        }
        seller.setName(textFieldName.getText());

        if (exception.getErrors().size() > 0) {
            throw exception;
        }

        return seller;
    }

    public void updateFormData() {
        if (seller == null) {
            String msg = "Seller is null";
            System.out.println("Erro ao atualizar vendedor: " + msg);
            Alerts.showAlert("Erro ao atualizar vendedor", null, msg, AlertType.ERROR);
            throw new IllegalStateException(msg);
        }

        Locale.setDefault(Locale.US);

        textFieldId.setText(String.valueOf(seller.getId()));
        textFieldName.setText(seller.getName());
        textFieldEmail.setText(seller.getEmail());
        textFieldBaseSalary.setText(String.format("%.2f", seller.getBaseSalary()));
        datePickerBirthDate.setValue(seller.getBirthDate());

        if (seller.getDepartment() == null) {
            comboBoxDepartment.getSelectionModel().selectFirst();
        } else {
            comboBoxDepartment.setValue(seller.getDepartment());
        }
    }

    private void setErrorMessages(Map<String, String> errors) {
        Set<String> fields = errors.keySet();

        if (fields.contains("name")) {
            labelErrorName.setText(errors.get("name"));
        }
    }

    private void initializeNodes() {
        Constraints.setTextFieldInteger(textFieldId);
        Constraints.setTextFieldMaxLength(textFieldName, 70);
        Constraints.setTextFieldDouble(textFieldBaseSalary);
        Constraints.setTextFieldMaxLength(textFieldEmail, 60);
        Utils.formatDatePicker(datePickerBirthDate, "dd/MM/yyyy");
        initializeComboBoxDepartment();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeNodes();
        sellerService = new SellerService();
        departmentService = new DepartmentService();
    }

    public void loadDepartments() {
        if (seller == null) {
            String msg = "Department service is null";
            System.out.println("Erro ao carregar departamentos: " + msg);
            Alerts.showAlert("Erro ao carregar departamentos", null, msg, AlertType.ERROR);
            throw new IllegalStateException(msg);
        }
        List<Department> departments = departmentService.findAll();
        obsDepartments = FXCollections.observableArrayList(departments);
        comboBoxDepartment.setItems(obsDepartments);
    }

    private void initializeComboBoxDepartment() {
        Callback<ListView<Department>, ListCell<Department>> factory = lv -> new ListCell<Department>() {
            @Override
            protected void updateItem(Department item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty ? "" : item.getName());
            }
        };
        comboBoxDepartment.setCellFactory(factory);
        comboBoxDepartment.setButtonCell(factory.call(null));
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void setSellerService(SellerService service) {
        this.sellerService = service;
    }
}
