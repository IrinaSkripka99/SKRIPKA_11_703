package ru.itis;

import java.util.Arrays;
import java.util.Scanner;

//Б5
public class EX67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = {1,2,3,4,5,6};

        int k = in.nextInt();
        System.out.println(Arrays.toString(shift(a,k)));
    }
    public static int[] shift(int[] a, int k) {
        int[] a1 = new int[a.length];
        while (a.length<k){
            k = k - a.length;
        }
        System.arraycopy(a, 0, a1, k, a.length - k);
        System.arraycopy(a, a.length - k, a1, 0, k);
        return a1;
    }
}
