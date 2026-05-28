package com.curso.controller;

import java.net.URL;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;

import com.curso.listeners.DataChangeListener;
import com.curso.model.Seller;
import com.curso.service.SellerService;
import com.curso.util.Alerts;
import com.curso.util.Utils;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class SellerController implements Initializable, DataChangeListener {

    private SellerService service;

    private ObservableList<Seller> obsSellers;

    @FXML
    private TableView<Seller> tableViewSeller;

    @FXML
    private TableColumn<Seller, Integer> tableColumnId;

    @FXML
    private TableColumn<Seller, String> tableColumnName;

    @FXML
    private TableColumn<Seller, Seller> tableColumnEdit;

    @FXML
    private TableColumn<Seller, Seller> tableColumnRemove;

    @FXML
    private Button btnNew;

    @FXML
    public void onBtnNewAction(ActionEvent event) {
        Seller newSeller = new Seller();
        createDialogForm(newSeller, "seller-form", Utils.currentStage(event));
    }

    private void initEditButtons() {
        tableColumnEdit.setCellValueFactory(
                param -> new ReadOnlyObjectWrapper<>(param.getValue()));

        tableColumnEdit.setCellFactory(
                param -> new TableCell<Seller, Seller>() {

                    private final Button button = new Button("edit");

                    @Override
                    protected void updateItem(Seller seller, boolean empty) {
                        super.updateItem(seller, empty);

                        if (seller == null) {
                            setGraphic(null);
                            return;
                        }

                        setGraphic(button);
                        button.setOnAction(
                                event -> createDialogForm(
                                        seller,
                                        "seller-form",
                                        Utils.currentStage(event)));
                    }
                });
    }

    private void initRemoveButtons() {
        tableColumnRemove.setCellValueFactory(
                param -> new ReadOnlyObjectWrapper<>(param.getValue()));

        tableColumnRemove.setCellFactory(
                param -> new TableCell<Seller, Seller>() {

                    private final Button button = new Button("remove");

                    @Override
                    protected void updateItem(Seller seller, boolean empty) {
                        super.updateItem(seller, empty);

                        if (seller == null) {
                            setGraphic(null);
                            return;
                        }

                        setGraphic(button);
                        button.setOnAction(event -> removeEntity(seller));
                    }
                });
    }

    private void removeEntity(Seller seller) {
        Optional<ButtonType> result = Alerts.showConfirmation("Confirmation", "Are you sure to delete?");

        if (result.get() == ButtonType.OK) {
            if (service == null) {
                String msg = "Service is null";
                System.out.println("Erro ao remover vendedor: " + msg);
                Alerts.showAlert("Erro ao remover vendedor", null, msg, AlertType.ERROR);
                throw new IllegalStateException(msg);
            }

            service.remove(seller);
            updateTableView();
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id"));
        tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name"));

        service = new SellerService();
        updateTableView();
    }

    public void updateTableView() {
        if (service == null) {
            String msg = "Service is null";
            System.out.println("Erro ao atualizar tabela: " + msg);
            Alerts.showAlert("Erro ao atualizar tabela", null, msg, AlertType.ERROR);
            throw new IllegalStateException(msg);
        }

        List<Seller> sellers = service.findAll();
        obsSellers = FXCollections.observableArrayList(sellers);
        tableViewSeller.setItems(obsSellers);

        initEditButtons();
        initRemoveButtons();
    }

    private void createDialogForm(Seller seller, String fxml, Stage parentStage) {
        // try {
        // FXMLLoader loader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        // Parent parent = loader.load();

        // SellerFormController controller = loader.getController();
        // controller.setSeller(seller);
        // controller.subscribeDataChangeListener(this);
        // controller.updateFormData();

        // Stage dialogStage = new Stage();
        // dialogStage.setTitle("Enter Seller data");
        // dialogStage.setScene(new Scene(parent));
        // dialogStage.setResizable(false);
        // dialogStage.initOwner(parentStage);
        // dialogStage.initModality(Modality.WINDOW_MODAL);
        // dialogStage.showAndWait();
        // } catch (IOException e) {
        // System.out.println("Erro ao criar dialog: " + e.getMessage());
        // Alerts.showAlert("Erro ao criar dialog", null, e.getMessage(),
        // AlertType.ERROR);
        // }
    }

    public void setSellerService(SellerService service) {
        this.service = service;
    }

    @Override
    public void onDataChanged() {
        updateTableView();
    }
}
