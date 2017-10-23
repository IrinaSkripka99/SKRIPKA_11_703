package ru.itis;//+

import java.util.Scanner;

public class Ex10b {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n = in.nextInt();
        double x = in.nextDouble();
        int pow = 1;

        double s = x, t = x;

        for (int i = 1; i <= n; i++) {
            pow = -pow;
            t *= x * x * x * x / (2 * i * (2 * i - 1));
            s += pow * t / (4 * i + 1);  //конечно вы здесь схитрили малость

        }
        System.out.print(s);
    }
}

