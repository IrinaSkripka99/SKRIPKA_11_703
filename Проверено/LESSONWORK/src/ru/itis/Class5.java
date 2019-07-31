package ru.itis;
import java.util.Random;
import java.util.Scanner;
public class Class5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a = new int[10];
        int  x=in.nextInt();
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            a[i] = r.nextInt(20);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        boolean f=false;
        for (int i=0;i<a.length & !f ;i++){
            if (a[i]==x) f=true;
        }
        if (f) System.out.println("есть");
        else System.out.println("нет");
    }
}