package ru.itis;

import java.util.Scanner;

public class Ex22d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println();
        boolean f = true;
        int col = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((a[j] == a[i]) & (j != i)) {
                    f = false;
                    break;
                }
            }
            if (f) col++;
            f = true;
        }
        System.out.println(col);
    }
}

