package com.example.digitalelection;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Login {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button LoginButton;

    @FXML
    private Button NewUserAddition;

    @FXML
    private TextField voteridTextField; // TextField for Username input

    @FXML
    private PasswordField userPinTextField; // TextField for UserPin input

    @FXML
    private void LoginButton(ActionEvent event) throws Exception {
        int voterid = Integer.parseInt(voteridTextField.getText());
        String userPin = userPinTextField.getText();
        if(LoginDAO.isValid(voterid,userPin)){
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("election.fxml")));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }

    @FXML
    private void NewUserAddition(ActionEvent event ){
        Parent root = null;
        try {
            root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("register.fxml")));
        } catch (IOException e) {
            e.printStackTrace();
        }
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}
