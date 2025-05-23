package BLL.LoginBLL;

import GUI.View.SceneManager;
import Utils.LoggedInUser;
import Utils.UserSession;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class LoginChoice {

    // Login for Admin
    public void adminLogin() throws IOException {
        LoggedInUser.setLoggedInRole("Admin");
        UserSession.setLoggedIn(true);

        // Load all required components
        SceneManager.loadScene("customTitleBar", "/View/TitleBar.fxml");
        SceneManager.loadScene("navbar", "/View/Navbar.fxml");
        SceneManager.loadScene("adminPage", "/View/Admin.fxml");

        // Compose them in order
        List<String> loginScenes = List.of(
                "customTitleBar",
                "navbar",
                "adminPage"
        );
        SceneManager.composeScene(loginScenes, "ComposedAdmin");
        SceneManager.switchScene("ComposedAdmin");
    }



    // Login for Operator
    public void operatorLogin() throws IOException {
        LoggedInUser.setLoggedInRole("Operator");
        UserSession.setLoggedIn(true);

        SceneManager.loadScene("customTitleBar", "/View/TitleBar.fxml");
        SceneManager.loadScene("navbar", "/View/Navbar.fxml");
        SceneManager.loadScene("orderPage", "/View/Orders.fxml");

        List<String> loginScenes = List.of(
                "customTitleBar",
                "navbar",
                "orderPage"
        );

        SceneManager.composeScene(loginScenes, "ComposedOrders");
        SceneManager.switchScene("ComposedOrders");
    }


    // Login for QA/QC
    public void qaLogin() throws IOException {
        LoggedInUser.setLoggedInRole("QA");
        UserSession.setLoggedIn(true);

        SceneManager.loadScene("customTitleBar", "/View/TitleBar.fxml");
        SceneManager.loadScene("navbar", "/View/Navbar.fxml");
        SceneManager.loadScene("orderPage", "/View/Orders.fxml");

        List<String> loginScenes = List.of(
                "customTitleBar",
                "navbar",
                "orderPage"
        );

        SceneManager.composeScene(loginScenes, "ComposedOrders");
        SceneManager.switchScene("ComposedOrders");
    }
}