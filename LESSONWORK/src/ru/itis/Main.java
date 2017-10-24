package ru.itis;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int n = 5,s=0;
        int[] a = new int[n];
        int[] b = new int[n];
        Random r = new Random();
        for (int i = 0;i<n; i++){
            a[i] = r.nextInt(20);
            b[i] = r.nextInt(20);
            s+=a[i]*b[i];
        }
    System.out.println(s);
    }
}
