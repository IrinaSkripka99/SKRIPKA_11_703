package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex038 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int n = in.nextInt();
        double koef;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = r.nextInt(10);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
               koef=1.0*(a[j][i]/a[i][i]);
                for (int k = i; k < n; k++)
                    a[j][k] -=a[i][k] * koef;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
