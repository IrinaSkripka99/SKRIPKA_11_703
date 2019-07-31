package ru.itis;

import java.util.Scanner;

public class Ex15a {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), a[] = new int[n];
        int s = n, t = 0, l = 1;
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            if (a[i] <= a[i + 1]) {
                l++;
            } else {
                if (l > t) t = l;
                if (l < s) s = l;
                l = 1;
            }
        }
        if (l > t) t = l;
        if (l < s) s = l;
        System.out.println(s);
        System.out.println(t);
    }
}
