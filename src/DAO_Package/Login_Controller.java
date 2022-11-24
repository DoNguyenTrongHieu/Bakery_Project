package DAO_Package;

import Connected_Package.Connected_JDBC;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login_Controller extends Component {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    Label lblThongBao;
    @FXML
    Button btnSignIn;
    @FXML
    TextField txtUserName;
    @FXML
    PasswordField txtPassword;
    //    DAO_NhanVien dao_nhanVien = new DAO_NhanVien();
    public void loginApplication(ActionEvent event) throws IOException {
//        }
        if (txtUserName.getText().isBlank() == false && txtPassword.getText().isBlank() == false) {
            if (validateLogin() == true) {
                Parent root = (Parent) FXMLLoader.load(this.getClass().getResource("../FXML_Package/MainMenu.fxml"));
                scene = new Scene(root);
                scene.getStylesheets().add(getClass().getResource("../CSS/MainMenu.css").toExternalForm());
                stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(this.scene);
                stage.centerOnScreen();
                // test
                stage.setResizable(false);
                stage.show();
            }
        }
    }

    public boolean validateLogin() {
        Connected_JDBC connected_jdbc = new Connected_JDBC();
        Connection connection = connected_jdbc.getConnection();


            String verifyLogin = "select COUNT(1) from chucvu where TAIKHOAN='" + txtUserName.getText() + "' AND MATKHAU='" + txtPassword.getText() + "'";
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(verifyLogin);

                while (resultSet.next()) {
                    if (resultSet.getInt(Integer.valueOf(resultSet.getString(1))) == 1) {
                        return true;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        return false;
    }
}
