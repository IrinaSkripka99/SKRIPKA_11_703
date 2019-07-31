package ru.itis;

import java.util.Random;

public class Class7 {
    public static void main(String[] args) {
        int[] a = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            a[i] = r.nextInt(10);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        boolean f = true;
        for (int i = 0; i < a.length & f; i++) {
            if (a[i] != 0) f = false;
        }
        if (!f) System.out.println("есть");
        else System.out.println("нет");
    }
}
