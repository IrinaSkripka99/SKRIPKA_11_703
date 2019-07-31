package ru.itis;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String number = String.valueOf(n);
        int[] a = new int[number.length()];
        for (int i = number.length() - 1; i >= 0; i--) {
            a[i] = n % 10;
            n /= 10;
        }
        test(a,n);
    }

    public static void test(int[] a,int n) {
        int col = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    col+=fact(a.length-(i+1));
                }
            }
        }
        System.out.println(col);
    }

    public static int fact(int n){
        if (n<=0){
            return 1;
        }
        return n*fact(n-1);
    }
}

