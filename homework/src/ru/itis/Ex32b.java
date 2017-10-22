package ru.itis;

import java.util.Scanner;

public class Ex32b {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double eps=0.0001,x0,xn;
        double a=in.nextDouble();
        x0=a;
        xn=1+9*Math.sinh(x0)/2;
        while(Math.abs(xn-x0)>eps){
            x0=xn;
            xn=1+9*Math.sin(x0)/2;
        }
     System.out.println(xn);
    }
}
