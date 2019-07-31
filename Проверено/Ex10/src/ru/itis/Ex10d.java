package ru.itis;

import java.util.Scanner;

public class Ex10d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextDouble();
        double x = in.nextDouble();
        double s = 0, k = 1, t = 1;
        for (int i = 1; i <= 2 * n; i++) {
            if (i % 2 == 0) {
                k *= x * x / i;
                s += k;
            } else {
                t *= x * x / i;
                s += t;
            }
        }
        System.out.print(s);

    }
}
