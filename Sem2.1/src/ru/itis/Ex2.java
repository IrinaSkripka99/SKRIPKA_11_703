package ru.itis;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 3, m = 4;
        double  u;
        int[][] a = new int[n][m];
        double[][] b = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i][1] == Math.sqrt(a[i][2] * a[i][4])) {
                    b[i][j] = (a[i][j] + 1) * Math.pow(Math.E, 1 + a[i][j]);
                } else {
                    u = Math.pow(Math.E, b[i][j]);
                    b[i][j] = 1 - u + a[i][j] * u;
                }
            }
        }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(b[i][j]);
                }
                System.out.println();
            }
        }
    }


