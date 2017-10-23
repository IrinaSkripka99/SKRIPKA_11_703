package ru.itis;//+
import java.util.Scanner;

public class Ex23b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double x = in.nextDouble();
        double v0, v1, v2, sum,pow=1;
        int step = 4;
        v0 = v1 = a;
        v2 = v1 + v0;
        sum = v0 * Math.cos(v0 * x) * Math.cos(v0 * x) - v1 / 2 * Math.cos(v1 * x) * Math.cos(v1 * x);
        while (v2 <= b) {
            sum = pow * v2 / step * Math.cos(v2 * x) * Math.cos(v2 * x);
            pow = -pow;
            step *= 2;// не очень хорошо
            v0 = v1;
            v1 = v2;
            v2 = v1 + v0;
        }
        System.out.println(sum);

    }
}

