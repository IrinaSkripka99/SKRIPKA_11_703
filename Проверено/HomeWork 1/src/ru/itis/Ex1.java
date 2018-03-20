package ru.itis;//-

import java.util.Scanner;
import java.util.Random;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int m = a[0];
        int col = 1;
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(20) - 5;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < a.length; i++) {
            if (a[i] < m) {
                m = a[i];   //неверный алгоритм. Попробуйте прпустить массив типа 5, 5, 5, 4, 4, 4, 2, 2, 2, 1, 1, 1
            }
            if (a[i] == m) {
                col++;
            }
        }
        System.out.print(col);
    }
}

