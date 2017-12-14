package ru.itis;

import java.util.Scanner;

public class Ex8_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] T1=new int[10];
        for (int i = 0; i < T1.length; i++) {
            T1[i]=in.nextInt();
        }
        int k = 0;
        for (int i = 0; i < T1.length; i++){
            System.out.print(T1[i] + " ");
            k += T1[i];
        }
        System.out.println();
        System.out.println(k);
    }
}
