package ru.itis;//+

import java.util.Scanner;

public class Ex10c {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double x = in.nextDouble();
        double s = 0, t = 1;
        for (int i = 1; i <= n; i++) {
            t *= x * x * (2 * i - 1) / (2 * i);
            s += t;
        }
        System.out.print(s);
    }
}
