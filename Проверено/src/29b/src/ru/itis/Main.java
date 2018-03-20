package ru.itis;

public class Main {

    public static void main(String[] args) {
        double x0 = 0, x1, eps = 0.0001;
        int n = 1;
        x1 = Math.cos(x0);
        while (Math.abs(x0 - x1) > eps) {
            x0 = x1;
            x1 = Math.cos(x0);
            n++;
        }
        System.out.print(n);
    }
}
