package ru.itis;

public class Ex15b {
    public static void main(String[] args) {
        int[] a = {1, 4, 5, 8, 2, 3, 6, 1, 2, 0, 3, 7};
        int[] u = new int[a.length];
        int l = 1;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1])
                l++;
            else {
                u[l - 1]++;
                l = 1;
            }
        }
        for (int i = a.length - 1; i < a.length; i++) {//зачем здесь оператор цикла, который прорабатывает ровно 1 раз?
                u[l - 1]++;
            }
        for (int i = 0; i < u.length; i++) {
            System.out.print(u[i] + " ");
        }
    }
}

