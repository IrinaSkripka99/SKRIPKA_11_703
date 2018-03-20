package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int ind_min = 0;
        int ind_max = 0;
        int result = 0;
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(20);
            System.out.print(a[i] + " ");
        }
        int min = a[0];
        int max = min;
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
                ind_min = i;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                ind_max = i;
            }
        }
        if (ind_min < ind_max) {
            for (int i = ind_min + 1; i != ind_max; i++) {
                result += a[i];
            }
        }
            else {
            for (int i = ind_max + 1; i != ind_min; i++) {
                result += a[i];
            }
        }
        System.out.print(result);
    }
}