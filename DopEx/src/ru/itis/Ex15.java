package ru.itis;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r ;
        int m = 0;
        int q = 1;
        while (n > 0) {
            r = n % 10;
            if (r % 2 != 0) {
                m += r * q;
                q *= 10;
            }
            n /= 10;
        }
        System.out.println(m);
    }
}
