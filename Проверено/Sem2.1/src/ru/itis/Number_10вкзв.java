package ru.itis;

import java.util.Scanner;

public class Number_10вкзв {
    public static void main(String[] args) {
        int n = 3, m = 4;
        double[][] matrixA = new double[n][m];
        System.out.println("Матрица А");
        enterMatrix(matrixA, n, m);

        double[][] matrixB = new double[n][m];
        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (P(i, matrixA, m)) {
                    matrixB[i][j] = f(matrixB[i][j]);
                } else {
                    matrixB[i][j] = g(matrixA[i][j]);
                }
            }
        }
        System.out.println();
        System.out.println("матрица В");
        showMatrix(matrixB, n, m);

    }


    public static double f(double x) {
        return (x + 1) * Math.pow(Math.E, 1 + x);
    }

    public static double g(double x) {
        return 1 - Math.pow(Math.E, x) + x * Math.pow(Math.E, x);
    }

    public static boolean P(int i, double[][] matrixA, int m) {
        if (matrixA[i][1] == Math.sqrt(matrixA[i][2] * matrixA[i][m - 1])) {
            return true;
        }
        return false;
    }

    public static void enterMatrix(double[][] matrixA, int n, int m) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
    }

    public static void showMatrix(double matrixA[][], int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrixA[i][j] + " ");
            }
            System.out.println();
        }
    }

}