package com.example.digitalelection;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;
import java.util.Objects;

public class VotingMachine {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Button party1;

    @FXML
    private Button party2;

    @FXML
    private Button party3;

    @FXML
    private Button party4;

    @FXML
    private Button party5;

    @FXML
    private Button login;

    @FXML
    private void party1(ActionEvent event) throws Exception {
        VotingMachineDAO.addVote("party1");
        exit(event);
    }

    @FXML
    private void party2(ActionEvent event) throws Exception {
        VotingMachineDAO.addVote("party2");
        exit(event);
    }

    @FXML
    private void party3(ActionEvent event) throws Exception {
        VotingMachineDAO.addVote("party3");
        exit(event);
    }

    @FXML
    private void party4(ActionEvent event) throws Exception {
        VotingMachineDAO.addVote("party4");
        exit(event);
    }

    @FXML
    private void party5(ActionEvent event) throws Exception {
        VotingMachineDAO.addVote("party5");
        exit(event);
    }
    @FXML
    private void login(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    private void exit(EventObject event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("exit.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}

