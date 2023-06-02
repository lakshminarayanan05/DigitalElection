package com.example.digitalelection;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Register {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Button CreateAccount;
    @FXML
    private Button Login;

    @FXML
    private TextField nametext;
    @FXML
    private TextField gendertext;
    @FXML
    private TextField voteridtext;
    @FXML
    private TextField phonetext;
    @FXML
    private TextField taluktext;
    @FXML
    private TextField statetext;
    @FXML
    private PasswordField passwordtext;
    @FXML
    private PasswordField confirmpasstext;
    @FXML
    private void CreateAccount(ActionEvent event) throws Exception {

        Voters voter = new Voters();

        String name = nametext.getText();
        voter.setName(name);
        String gender = gendertext.getText();
        voter.setGender(gender);
        long voterid = Long.parseLong(voteridtext.getText());
        voter.setVoterId(voterid);
        long phone = Long.parseLong(phonetext.getText());
        voter.setPhone(phone);
        String taluk = taluktext.getText();
        voter.setTaluk(taluk);
        String state = statetext.getText();
        voter.setState(state);
        String password = passwordtext.getText();
        String confirmpass = confirmpasstext.getText();

            if (!password.equals(confirmpass)){
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Warning");
                alert.setHeaderText("Your Password is mismatched");
                alert.show();
            }
            else{
                    voter.setPassword(password);
                    RegisterDAO.addUser(voter);
                    root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
                    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    scene = new Scene(root);
                    stage.setScene(scene);
                    stage.show();
            }
    }

    @FXML
    private void Login(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
