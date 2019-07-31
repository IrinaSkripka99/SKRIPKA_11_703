package ru.itis;
//магический квадрат
import java.util.Scanner;

public class Ex5 {

    public static void readMatrix(int a[][]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = in.nextInt();
            }
        }
    }

    public static void showMatrix(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        readMatrix(a);
        boolean f = true;
        int sum = 0, sumst, sumstol, sumd = 0;
        for (int i = 0; i < n; i++){
            sum += a[i][i];
        }
        for ( int i = 0; i < n && f; i++){
            sumst = 0;
            sumstol = 0;
            for (int j = 0; j < n; j++){
                sumst += a[i][j];
                sumstol += a[j][i];

            }
            if (sum != sumst || sum != sumstol) f = false;
            sumd += a[i][n - 1 - i];
        }
        if (sum != sumd) f = false;
        if (f) System.out.println("магический квадрат");
        else System.out.println("не магический квадрат");

    }
}
