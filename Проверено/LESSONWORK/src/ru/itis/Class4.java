package ru.itis;

public class Class4 {
    public static void main(String[] args) {
        int[] x = {2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7};
        int[] v = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int l = 1;
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] == x[i + 1]) l++;
            else {
                v[l - 1]++;
                l = 1;
            }
            v[l - 1]++;
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(v[i] + " ");
        }
    }
}

