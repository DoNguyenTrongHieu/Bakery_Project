package DAO_Package;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Menu_Controller {
    private static Parent root;
    private static Scene scene;
    private static Stage stage;
    @FXML
    Button btnCustomer;

    public void openSceneCustomer (ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../FXML_Package/Customer.fxml"));
        root = loader.load();
        scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("../CSS/Customer.css").toExternalForm());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(this.scene);
        stage.centerOnScreen();
        stage.setResizable(false);
        stage.show();
    }

}
