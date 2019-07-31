package ru.itis;

import java.util.Random;

public class Ex22_5 {

    public static void main(String[] args) {
        Random r = new Random();
        int n = 10, count = 0;
        int[] a = new int[n];
        int f = 0;
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(4);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n && f < 2; j++) {
                if(a[i] == a[j]){
                    f += 1;
                }
            }
            if(f == 1) count++;
            f = 0;
        }
        System.out.println(count);
    }
}
