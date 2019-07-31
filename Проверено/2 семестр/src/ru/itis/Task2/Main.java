package ru.itis.Task2;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(
                new FileReader("input.txt"));

        int countOfCircles = Integer.parseInt(reader.readLine());

        Circle circles[] = new Circle[countOfCircles];

        for (int i = 0; i < countOfCircles; i++) {
            String radiusWithPoints[] = reader.readLine().split(" ");
            int radius = Integer.parseInt(radiusWithPoints[0]);
            int score = Integer.parseInt(radiusWithPoints[1]);
            Circle circle = new Circle(radius, score);
            circles[i] = circle;
        }

        int countOfShoots = Integer.parseInt(reader.readLine());


    }
}
