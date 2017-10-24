package ru.itis;

import java.util.Random;

public class Ex11b {
    public static void main(String[] args) {
        int n = 10;
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            x[i] = r.nextInt(20);
            System.out.print(x[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < (n - 1); i++) {
            y[i] = x[i + 1];
            y[9]=x[0];
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            z[0] = x[9];
            z[i] = x[i - 1];
        }
        for (int i = 0; i < y.length; i++) {
            System.out.print(y[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < z.length; i++) {
            System.out.print(z[i]+" ");
        }

    }
}
