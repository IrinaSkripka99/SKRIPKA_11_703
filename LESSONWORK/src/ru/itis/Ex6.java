package ru.itis;

import java.util.Random;

public class Ex6 {
    public static void main(String[] args) {
        int n = 10;
        int[] x = new int[n];
        int[] y = new int[n];
        int[] z = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            x[i] = r.nextInt(20)-10;
            System.out.print(x[i]+" " );
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            if (x[i] * x[i - 1] < 0) y[i] = 0;
            else y[i] = 1;
            System.out.print(y[i] +" ");
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            if (x[i - 1] > x[i]) z[i] = 0;
            else z[i] = 0;
            System.out.print(z[i] + " ");
        }
    }
}
