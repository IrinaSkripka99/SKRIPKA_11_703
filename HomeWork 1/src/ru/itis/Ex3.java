package ru.itis;

import java.util.Random;
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int max = a[0];
        int result = 1;
        int ind_max = 0;
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(20) ;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                ind_max = i;
            }
        }
        for (int i = ind_max+1; i < a.length; i++) {
            if (a[i] != 0) {
                result *= a[i];
            }
        }
        System.out.print(result);
    }
}
