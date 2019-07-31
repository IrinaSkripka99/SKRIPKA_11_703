package ru.itis;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(Check(a));
    }

    public static boolean Check(int[] a) {
        int n, chet, nechet, col_ch = 0, col_nech = 0;
        int b;
        for (int i = 0; i < a.length; i++) {
            n = 0;
            chet = 0;
            nechet = 0;
            while (a[i] != 0) {
                b = a[i] % 10;
                if (b % 2 == 0) chet++;
                else nechet++;
                a[i] /= 10;
                n++;
            }
            if (n == nechet) col_nech++;
            if (n == chet) col_ch++;

        }
        if (col_ch == 2 || col_nech == 2) return true;
        else return false;
    }
}
