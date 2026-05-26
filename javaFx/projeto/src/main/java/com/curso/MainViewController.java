package com.curso;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class MainViewController implements Initializable {

    @FXML
    private MenuItem menuItemSeller;

    @FXML
    private MenuItem menuItemDepartment;

    @FXML
    private MenuItem menuItemAbout;

    @FXML
    private Pane contentConteiner;

    @FXML
    public void onMenuItemSellerAction() {
        System.out.println("Seller Action");
    }

    @FXML
    public void onMenuItemDepartmentAction() {
        System.out.println("Department Action");
    }

    @FXML
    public void onMenuItemAboutAction() throws IOException {
        contentConteiner.getChildren().clear();
        contentConteiner.getChildren().add(App.loadFXML("about"));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
