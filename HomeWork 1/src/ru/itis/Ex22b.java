package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex22b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int z = 0;
        int[] a = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(20) - 10;
            System.out.print(a[i] + "");
        }
        System.out.println(" ");

        for (int i = 0; i < (n - 1); i++) {
            if (a[i] * a[i + 1] < 0) z++;
        }
        System.out.println(z);
    }
}

