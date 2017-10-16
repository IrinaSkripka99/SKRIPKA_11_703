package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            double x = in.nextDouble();
        } while (Math.abs(x) >= 1);
        int n = 1;
        int pow = -1;
        double eps = 0.0001, s = 0, t = x;
        while (Math.abs(t) > eps) {
            t *= 1.0 * pow * (x/(n/(n-1)));
            pow = -pow;
            s += t ;
            n++;
        }
        System.out.print(s);
    }
}

