package sample.controllers;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import sample.server.SocketClient;


import java.io.PrintWriter;
import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    private int step = 15;
    private int countLifes = 3;

    private static int scoreEgg = 0;
    private AnimationTimer startAnimation;
    private long speed;
    private double[] hareTranslateX = new double[]{60, 190, 310, 440, 555};
    private Random rand = new Random();
    private PrintWriter out;
    @FXML
    private Label scoreLabel;
    @FXML
    private ImageView egg;
    @FXML
    private GridPane pane;
    @FXML
    private ImageView hare;
    @FXML
    private ImageView badEgg;
    @FXML
    private Button startButton;
    @FXML
    private ImageView life1;
    @FXML
    private ImageView life2;
    @FXML
    private ImageView life3;
    @FXML
    private ImageView loser;
    public SocketClient client;

    @FXML
    void handle(ActionEvent event) {

        loser.setVisible(false);
        speed = 400_000_000;
        life1.setVisible(true);
        life2.setVisible(true);
        life3.setVisible(true);
        scoreEgg = 0;
        countLifes = 3;
        scoreLabel.setText("Score: " + scoreEgg);
        hare.setVisible(true);
        badEgg.setVisible(false);
        startButton.setVisible(false);
        pane.getScene().setOnKeyPressed(event1 -> {
            switch (event1.getCode()) {
                case A:
                    left();
                    break;
                case D:
                    right();
                    break;
                case LEFT:
                    left();
                    break;
                case RIGHT:
                    right();
                    break;
            }
        });
        randomEgg();

    }

    private void randomEgg() {

        egg.setTranslateY(-140);
        egg.setTranslateX(getTranslateXEgg());
        badEgg.setTranslateX(egg.getTranslateX());
        if (scoreEgg == 5) {
            speed = 300_000_000;
        } else if (scoreEgg == 15) {
            speed = 200_000_000;
        } else if (scoreEgg == 25) {
            speed = 100_000_000;
        }
        startAnimation = new AnimationTimer() {
            private long lastUpdate = 0;

            @Override
            public void handle(long now) {

                if (now - lastUpdate >= speed) {
                    startGame();
                    lastUpdate = now;
                }
            }
        };
        startAnimation.start();
    }

    private void startGame() {
        if (client == null) {
            client = new SocketClient();
            client.startConnection("127.0.0.1", 6666);
            System.out.println(client);
        }
        int translateEgg = 30;
        egg.setVisible(true);
        badEgg.setVisible(false);
        if (egg.getTranslateY() != 160) {
            egg.setTranslateY(egg.getTranslateY() + translateEgg);
            if (collisionEggAndCheck(hare, egg)) {
                scoreEgg++;
                egg.setVisible(false);
                scoreLabel.setText("Score: " + Integer.toString(scoreEgg));
                egg.setTranslateY(-140);
                startAnimation.stop();
                System.out.println(scoreLabel.getText());

                randomEgg();
            }
        } else {
            checkLives();
        }

    }

    private void checkLives() {
        if (countLifes == 3 | countLifes == 2) {
            if (countLifes == 3) {
                life3.setVisible(false);
            } else {
                life2.setVisible(false);
            }
            countLifes--;
            egg.setTranslateY(-140);
            startAnimation.stop();
            randomEgg();
        } else if (countLifes == 1) {
            life1.setVisible(false);
            startAnimation.stop();
            startButton.setVisible(true);
            hare.setVisible(false);
            startButton.setText("You are loser");
            client.sendMessage("Result"+scoreLabel.getText());
            startButton.setOnAction(this::handle);
            loser.setVisible(true);
        }
        egg.setVisible(false);
        badEgg.setVisible(true);
    }

    private double getTranslateXEgg() {
        return hareTranslateX[rand.nextInt(hareTranslateX.length)];
    }


    private boolean collisionEggAndCheck(ImageView hare, ImageView egg) {
        double endEggX = egg.getTranslateX() + egg.getFitWidth();
        double endEggY = egg.getTranslateY() + egg.getFitHeight();
        double endHareY = hare.getTranslateY() + hare.getFitHeight();
        double endHareX = hare.getTranslateX() + hare.getFitWidth();
        if (endEggX <= endHareX && endEggY <= endHareY) {
            if (egg.getTranslateY() >= hare.getTranslateY() && egg.getTranslateX() >= hare.getTranslateX()) {
                return true;
            }
        }
        return false;
    }

    private void left() {
        double resultX = hare.getTranslateX() - step;
        if (resultX < 0) resultX = 0;
        hare.setTranslateX(resultX);
    }

    private void right() {
        double resultX = hare.getTranslateX() + step;
        if (resultX > pane.getWidth() - 48) resultX = pane.getWidth() - 48;
        hare.setTranslateX(resultX);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
