package ru.itis;//+

public class Ex7 {

    public static void main(String[] args) {
        double  Pi = 3.1415;
        double eps = 0.0001;
        double r = 4.0/3;
        int n = 2;
        for (int k = 2; Math.abs(r - (Pi / 2)) >= eps; k++){
            r *= ((2.0*k) / (2.0*k - 1)) * ((2.0*k) / (2.0*k + 1) );
            n++;
        }
        System.out.println(n);

    }
 }
