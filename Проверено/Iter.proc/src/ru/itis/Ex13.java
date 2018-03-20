package ru.itis;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pow = 1, del, sum = 0;
        while (n > 0) {
            del = n % 10;
            sum += pow * del;
            n/= 10;
            pow = -pow;
        }
        System.out.println(sum);
    }
}

