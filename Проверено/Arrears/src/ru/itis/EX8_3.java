package ru.itis;

import java.util.Scanner;

public class EX8_3 {
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
        int [] ob = new int[T1.length];
        int [] per = new int[T1.length];
        int [] raz = new int[T1.length];

        for ( int i = 0; i < T1.length; i++){
            System.out.print(T1[i] + " ");
        }
        System.out.println();
        for ( int i = 0; i < T2.length; i++){
            System.out.print(T2[i] + " ");
        }
        System.out.println();
        System.out.println("объединение T1 и T2");
        for ( int i = 0; i < ob.length; i++){
            if (T1[i] == 1 || T2[i] == 1) ob[i] = 1;
            System.out.print(ob[i] + " ");
        }
        System.out.println();
        System.out.println("пересечение T1 и T2");
        for ( int i = 0; i < per.length; i++){
            if (T1[i] == 1 & T2[i] == 1) per[i] = 1;
            System.out.print(per[i] + " ");
        }
        System.out.println();
        System.out.println("разность T1 и T2");
        for ( int i = 0; i < raz.length; i++){
            if(T1[i] == 1 & T1[i] != T2[i]) raz[i] = 1;
            System.out.print(raz[i] + " ");
        }
    }
}
