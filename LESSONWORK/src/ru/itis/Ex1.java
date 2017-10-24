package ru.itis;

import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        int n = 10;
        int[] a = new int[n];
        int c = a[0];
        int col = 0;
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(20) -5;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < a.length; i++) {
            if (a[i] < c) {
                c = a[i];
                col++;
            }

        }
        System.out.println(col);


    }
}
