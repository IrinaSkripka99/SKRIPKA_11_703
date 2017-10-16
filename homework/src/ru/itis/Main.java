package ru.itis;

public class Main {

    public static void main(String[] args) {
        double  Pi = 3.1415;
        double eps = 0.0001;
        double r = 4/3;
        int n = 2;
        for (int k = 2; Math.abs(r - (Pi / 2)) >= eps; k++){
            r *= ((2*k) / (2*k - 1)) * ((2*k) / (2*k + 1) );
            n++;
        }
        System.out.println(n);

    }
 }
