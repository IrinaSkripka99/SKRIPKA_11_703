package ru.itis;

public class Sem2 {
    public static void main(String[] args) {
        double u, eps = 1.8, e = 2.7182;
        int n = 14;
        double[] a = new double[n];
        double[] b = new double[n];
        b[0] = 0.25;
        a[0] = -7.18;
        for (int i = 1; i < n; i++) {
            a[i] = Math.pow(e, -(a[i - 1] * a[i - 1] + 2 * b[i - 1] + 0.7));
            if (a[i - 1] < 0) {
                u = Math.sin(a[i - 1] + b[i - 1]);
                b[i] = u * u;
            } else {
                b[i] = Math.sin((1 + a[i - 1] - b[i - 1]) * b[i - 1]);
            }
        }
        for (int i = 0; i < n; i++) {
            boolean f = true;
            for (int j = 0; j < n && f; j++) {
                if (Math.abs(a[i] + b[j]) < eps) f = false;
                if (!f) {
                    System.out.println(a[i] + " ");
                }
            }

        }
    }
}