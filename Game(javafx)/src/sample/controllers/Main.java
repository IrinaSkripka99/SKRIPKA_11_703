package sample.controllers;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import sample.server.Server;

import static com.sun.org.apache.xerces.internal.utils.SecuritySupport.getResourceAsStream;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("helloMenu.fxml"));
        primaryStage.setTitle("Ну,погоди!");
        Scene scene = new Scene(root, 660, 497);
        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image("/sample/img/icon.png"));
        primaryStage.show();


    }
    public static void main(String[] args) {
        launch(args);
    }
}
