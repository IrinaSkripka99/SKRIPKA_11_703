package ru.itis;

import java.util.Scanner;

public class Ex14b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a=in.nextDouble();
        double s, x, t, eps = 0.0001, k = 1;
        s = 0;
        x = in.nextDouble();
        t = 1 /a;
        while (t >= eps) {
            s += t * Math.log10(t * x);
            t *= 1.0 * (1 / a);
        }
        System.out.print(s);
    }
}

