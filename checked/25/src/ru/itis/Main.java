package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y0, y1, eps = 0.0001;
        if (x >= 1) {
            y0 = x / 3;
        } else {
            y0 = x;
        }
        y1 = y0 - 1.0 / 3 * (y0 - x / (y0 * y0));
        while (Math.abs(y1 - y0) > eps) {
            y0 = y1;
            y1 = y0 - 1 / 3 * (y0 - x / (y0 * y0));
        }
        System.out.print(y1);
    }
}