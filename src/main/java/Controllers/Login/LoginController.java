package Controllers.Login;

import javafx.scene.control.Alert;

public class LoginController {


    public boolean checkUsernameandPassward(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
           showAlert(Alert.AlertType.WARNING, "Validation Error", "Username and Password cannot be empty!");
            return false;
        }


        if (username.equals("admin") && password.equals("1234")) {
            showAlert(Alert.AlertType.INFORMATION, "Login Successful", "Welcome to Library Management System!");
            //direct to the main dashboard
        } else {
            showAlert(Alert.AlertType.ERROR, "Login Failed", "Invalid username or password.");
        }
        return false;
    }

        private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
