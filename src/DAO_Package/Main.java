package DAO_Package;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("../FXML_Package/Login.fxml"));
//        Group root = new Group();
            Scene scene = new Scene(root);
//            String css = this.getClass().getClass().getResource("DAO_Package/Login.css").toExternalForm();
            scene.getStylesheets().add(getClass().getResource("../CSS/Login.css").toExternalForm());
            primaryStage.setResizable(false);
            primaryStage.getIcons().add(new Image("Icon/Logo.jpg"));
            primaryStage.setTitle("Bakey Manager");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
            //ehe
        }
    }
}
