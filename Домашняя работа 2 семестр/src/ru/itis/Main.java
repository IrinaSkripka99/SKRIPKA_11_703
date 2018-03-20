package ru.itis;

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

        Shoot shoots[] = new Shoot[countOfShoots];

        for (int i = 0; i < countOfShoots; i++) {
            String dots[] = reader.readLine().split(",");
            int x = Integer.parseInt(dots[0]);
            int y = Integer.parseInt(dots[1]);
            Shoot shoot = new Shoot(x, y);
            shoots[i] = shoot;
        }

        int[] radius = new int[countOfCircles];
        int[] score = new int[countOfCircles];

        for (int i = 0; i < countOfCircles; i++) {
            radius[i] = circles[i].getRadius();
            score[i] = circles[i].getScore();
        }

        double[] calc = new double[countOfShoots];
        int sum = 0;
        for (int i = 0; i < countOfShoots; i++) {
            calc[i] = shoots[i].calcRadius();
            if (calc[i] <= radius[i] * radius[i]) {
                sum += score[i];
            }
            if (calc[i] <= radius[i-1] * radius[i-1] & calc[i] >= radius[0] * radius[0]) {
                sum += score[1];
            }
            if (calc[i] <= radius[2] * radius[2] & calc[i] >= radius[1] * radius[1]) {
                sum += score[2];
            }
        }
        System.out.println(sum);
    }
}
