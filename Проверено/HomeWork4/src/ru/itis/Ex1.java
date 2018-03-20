package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex1 {

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
            for (int j = 0; j < n - 1; j++) {
                for (int y = 0; y < n - 1; y++)
                    if (a[i][y] > a[i][y + 1]) {
                        t = a[i][y];
                        a[i][y] = a[i][y + 1];
                        a[i][y + 1] = t;
                    }
            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

