package ru.itis;

import java.util.Scanner;

public class B20_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x=in.nextDouble();
        double y1=0.5,yn,eps=0.001,n=2;
        yn=2*y1+(x-y1*y1)/3;
        while(Math.abs(yn-y1)>eps){
            y1=yn;
            yn=1.0*(2*y1+(x-y1*y1)/(3*n));
            n++;
        }
        System.out.println(yn);
    }
}
