package ru.itis;

import java.util.Random;

public class Ex22g {
        public static void main(String[] args) {
            int[] a = new int[10];
            int col=0;
            Random r = new Random();
            for (int i = 0; i < 10; i++) {
                a[i] = r.nextInt(10);
                System.out.print(a[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < a.length - 1 ; i++) {
                for (int j = i+1; j < a.length ; j++) {
                    if (a[i] == a[j]) col++;
                }
            }
            System.out.println(a.length-col);
        }
    }

