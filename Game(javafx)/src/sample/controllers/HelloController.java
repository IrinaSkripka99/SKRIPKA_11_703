package sample.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.server.Client;

import java.io.IOException;

public class HelloController {

    @FXML
    private Button startButton;

    @FXML
    private Button exitButton;


    @FXML
    private Label enterName;

    @FXML
    private TextArea getName;


    @FXML
    public void initialize() {

        exitButton.setOnMouseClicked(event -> System.exit(0));
        startButton.setOnMouseClicked(event -> {
            startButton.setVisible(false);
            exitButton.setVisible(false);
            getName.setVisible(true);
            enterName.setVisible(true);
            getName.setOnKeyPressed(event2 -> {
                if (event2.getCode() == KeyCode.ENTER) {
                    String name = getName.getText().trim();
                    if (!name.isEmpty()) {
                        try {
                            System.out.println("Hello "+name);
                            start();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } else {
                        getName.setText("Please,enter your name");
                    }
                }
            });
        });
    }

    @FXML
    private void start() throws IOException {
        Stage stage = (Stage) startButton.getScene().getWindow();

        stage.close();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample.fxml"));
        Parent root1 = (Parent) fxmlLoader.load();
        stage = new Stage();
        stage.getIcons().add(new Image("/sample/img/icon.png"));
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Ну,погоди!");
        stage.setScene(new Scene(root1));
        stage.show();
    }


}
