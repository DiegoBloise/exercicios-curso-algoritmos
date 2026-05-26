package com.curso.controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.curso.App;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.Pane;

public class MainController implements Initializable {

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
        changeView("seller");
    }

    @FXML
    public void onMenuItemDepartmentAction() {
        changeView("department");
    }

    @FXML
    public void onMenuItemAboutAction() {
        changeView("about");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    private void changeView(String view) {
        try {
            contentConteiner.getChildren().clear();
            contentConteiner.getChildren().add(App.loadFXML(view));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
