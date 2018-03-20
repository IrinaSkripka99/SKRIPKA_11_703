package ru.itis;

import java.util.Arrays;

public class Ex13g {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9};
        int[] w = new int[x.length];
        if (x[0] != x[1])
            w[0] = 1;
        if (x[x.length - 1] != x[x.length - 2]) {
            w[w.length - 1] = 1;
        }
        for (int i = 1; i < x.length - 2; i++) {
            if (x[i] != x[i + 1] && x[i] != x[i - 1]) {
                w[i] = 1;
            }
        }
        System.out.println(Arrays.toString(w));
    }
}
