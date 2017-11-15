package ru.itis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = 1, s = 0, pow = 1, t = 1;
        int n = in.nextInt();
        while (m < n) {
            s += t;
            t *= t * pow / (m * m);
            pow = -pow;
            m++;
        }
    }
}
