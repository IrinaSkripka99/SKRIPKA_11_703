package ru.itis;//+

import java.util.Scanner;

public class Ex20d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x0, y0, x1, y1, a, b, x2, y2, x3 = 0, y3=0, c, d, e, f, g, h,n;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();
        e = in.nextInt();
        f = in.nextInt();
        g = in.nextInt();
        h = in.nextInt();
        n=in.nextInt();
        x0 = y0 = a;
        x1 = y1 = b;
        x2 = y2 = c;
        for (int i = 3; i<=n; i++){
            x3 = d * x2 + e * y1 + f * x0;
            y3 = g * x2 + h * y1;
            x0 = x1;
            x1 = x2;
            x2 = x3;
            y0=y1;
            y1 = y2;
            y2 = y3;
        }
        System.out.println(x3);
        System.out.println(y3);
    }
}
