package ru.itis;

import java.util.Random;

public class Ex11a {

    public static void main(String[] args) {
        int n = 5;
        int[] x = new int[n];
        int[] y=new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            x[i] = r.nextInt(20);
            System.out.print(x[i] + ", ");
        }
        System.out.println();
        for (int i =0; i <n; i++) {
            y[i]=x[n-1-i];
            System.out.print(y[i] + ", ");
        }
    }
}
