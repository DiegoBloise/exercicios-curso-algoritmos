package com.curso.controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import com.curso.listeners.DataChangeListener;
import com.curso.model.Seller;
import com.curso.model.exceptions.ValidationException;
import com.curso.service.SellerService;
import com.curso.util.Alerts;
import com.curso.util.Constraints;
import com.curso.util.Utils;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class SellerFormController implements Initializable {

    private Seller seller;

    private SellerService service;

    private List<DataChangeListener> dataChangeListeners = new ArrayList<>();

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
    public void onBtnSaveAction(ActionEvent event) {
        try {
            seller = getFormData();
            service.saveOrUpdate(seller);
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

        textFieldId.setText(String.valueOf(seller.getId()));
        textFieldName.setText(String.valueOf(seller.getName()));
    }

    private void setErrorMessages(Map<String, String> errors) {
        Set<String> fields = errors.keySet();

        if (fields.contains("name")) {
            labelNameError.setText(errors.get("name"));
        }
    }

    private void initializeNodes() {
        Constraints.setTextFieldInteger(textFieldId);
        Constraints.setTextFieldMaxLength(textFieldName, 30);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initializeNodes();
        service = new SellerService();
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void setSellerService(SellerService service) {
        this.service = service;
    }
}
