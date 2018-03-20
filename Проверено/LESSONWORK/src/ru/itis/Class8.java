package ru.itis;

import java.util.Random;

public class Class8 {
    public static void main(String[] args) {
        int[] a = {1,2,5,9,7};
        boolean f = true;
        for (int i = 0; i < a.length - 1 & f; i++) {
            if (a[i] < a[i + 1]) f = false;
        }
        if (!f) System.out.println("по возрастанию");
        else {
            for (int i = 0; i < a.length - 1 & f; i++) {
                if (a[i] > a[i + 1]) f = false;
            }
            if (!f) System.out.println("по убыванию");
            else System.out.println("не упорядочен");
        }
    }
}

