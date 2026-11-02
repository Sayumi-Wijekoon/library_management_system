package Controllers.Login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginPageController {

    LoginController loginController = new LoginController();

    @FXML
    private Button btnClear;

    @FXML
    private Button btnLogin;

    @FXML
    private TextField txtPassword;

    @FXML
    private TextField txtUsername;

    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {
        if(loginController.checkUsernameandPassward(txtUsername.getText().trim(),txtPassword.getText().trim())){
            Stage stage = new Stage();
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/MainPage.fxml"))));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            stage.show();
        }
    }

    @FXML
    void btnClearOnAction(ActionEvent event) {
        txtUsername.clear();
        txtPassword.clear();
    }
}