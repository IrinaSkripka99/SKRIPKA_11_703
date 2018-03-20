package ru.itis;

import java.util.Scanner;

public class Ex8_2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] T1=new int[6];
        int[] T2=new int[6];
        for (int i = 0; i < T1.length; i++) {
            T1[i]=in.nextInt();
        }
        System.out.println();
        for (int i = 0; i < T1.length; i++) {
            T2[i]=in.nextInt();
        }
        boolean f = true;
        for ( int i = 0; i < T1.length; i++){
            System.out.print(T1[i] + " ");
        }
        System.out.println();
        for ( int i = 0; i < T2.length; i++){
            System.out.print(T2[i] + " ");
        }
        System.out.println();
        for ( int i = 0; i < T1.length & f; i++){
            if (T1[i] > T2[i]) f = false;
        }
        if (f) System.out.println("Множество T2 включает множество T1");
        else System.out.println("Множество T2 не включает множество T1");


    }
}
