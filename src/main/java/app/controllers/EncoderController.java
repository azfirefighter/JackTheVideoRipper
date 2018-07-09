package app.controllers;

import app.App;
import app.models.RectangleModel;
import app.utilities.Toolbelt;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class EncoderController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    public void handleMenuFileCloseButtonAction(ActionEvent event) throws Exception {
        App.exitApplication();
    }

    @FXML
    public void handleMenuHelpAboutButtonAction(ActionEvent event) throws Exception {
        Toolbelt toolbelt = new Toolbelt();
        Parent root = FXMLLoader.load(toolbelt.getResourceUrlAtPath("views/vwAbout.fxml"));

        Stage stage = new Stage();
        stage.setTitle ("About");
        stage.setScene(new Scene(root, 550, 400));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setResizable(false);

        RectangleModel bounds = toolbelt.getCenterForStageInWindow(stage.getScene().getWidth(), stage.getScene().getHeight());
        stage.setX(bounds.getX());
        stage.setY(bounds.getY());

        stage.show();
    }

    @FXML
    public void handleToolbarPlayButtonAction(ActionEvent event) throws Exception {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("This feature will be implemented soon!");
        alert.showAndWait();
    }

    @FXML
    public void handleToolbarStopButtonAction(ActionEvent event) throws Exception {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("This feature will be implemented soon!");
        alert.showAndWait();
    }
}