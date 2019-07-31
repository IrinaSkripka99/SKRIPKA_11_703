package ru.itis;//-

import java.util.Random;

public class Ex8_3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] b1 = new int[5];
        int[] b2 = new int[5];

        int[] s = {1, 2, 3, 4, 5};
        int[] T1 = {0, 1, 2, 8};


        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < T1.length; i++) {
            System.out.print(T1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < s.length; i++) {
            if (exists(T1, s[i])) {
                b1[i] = 1;
            } else {
                b1[i] = 0;
            }
            System.out.print(b1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < b1.length; i++) {
            b2[i] = r.nextInt(2);
            System.out.print(b2[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (b2[i] == b1[i] && b2[i] == 1) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
        System.out.println("T1 U T2");
        for (int i = 0; i < 7; i++) {
            if (b2[i] == b1[i] && b2[i] == 0) {
                System.out.print("0 ");
            } else {
                System.out.print("1 ");
            }
        }
        System.out.println();
        System.out.println("T1 && T2");
        for (int i = 0; i < 7; i++) {
            if (b2[i] == b1[i] && b2[i] == 1) {
                System.out.print("1 ");
            } else {
                System.out.print("0 ");
            }
        }
        System.out.println();
        System.out.println("T1/T2");
        for (int i = 0; i < 7; i++) {
            if (b2[i] == b1[i] && b2[i] == 1) {
                System.out.print("0 ");
            } else {
                System.out.print("0 ");   //почему печатаем? Надо вектор формировать
            }
        }

    }

    public static boolean exists(int[] T, int x) {
        for (int i = 0; i < T.length; i++) {
            if (T[i] == x) return true;
        }
        return false;
    }
}
