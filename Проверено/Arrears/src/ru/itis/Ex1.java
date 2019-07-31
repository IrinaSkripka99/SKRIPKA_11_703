package ru.itis;

import java.util.Random;

//задачи на массивы 1
public class Ex1 {
    public static void main(String[] args) {
        Random r = new Random();
        int n = 3, m = 3;
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {0, 0, 0}};

        int max = a[n][0];

        for (int i = 0; i < m; i++) {
            do {
                a[n][i] = r.nextInt(50);
            } while (a[n][0] < max);
        }
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

}
