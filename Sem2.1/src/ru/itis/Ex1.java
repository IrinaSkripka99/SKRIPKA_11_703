package ru.itis;

public class Ex1 {

    public static void main(String[] args) {
        int n = 12, x1;
        double[] y = new double[n];
        double[] f = new double[n];
        double[] x = {-5.3, 4.7, 15.2};
        for (int i = 1; i < x.length + 1; i++) {
            System.out.println("При x" + (i + 1));
            for (int j = 0; j < n; j++) {
                x1 = 2 * j - 7;
                if (x1 < 0) f[j] = Math.log10(x1 * x1 + 2.7);
                else f[j] = Math.log10(x1 + 2.7);
            }
        }
    }



    }