package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        int n = in.nextInt(), m = in.nextInt();
        int[][] a = new int[m][n];
        int t;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = r.nextInt(10);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = i+1; j < n; j++) {
                t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;

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
