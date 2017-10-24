package ru.itis;

import java.util.Scanner;

public class Ex12v {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        int n = 1;
        int pow = -1;
        double eps = 0.0001, s = 0, t = x;
        while (Math.abs(t) > eps) {
            s += t;
            n++;
            t *= 1.0 * pow * x * x / (2 * n + 1) * (2 * n);
            pow = -pow;
        }
        System.out.print(s);
    }
}
