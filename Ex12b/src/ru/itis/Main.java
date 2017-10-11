package ru.itis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
        double x=in.nextDouble();
        int n=1;
        int pow=-1;
        double s=0,eps=0.0001,t=1;
        while(Math.abs(t)>eps){
            s+=t;
            t*=1.0*pow*x*x/(2*n)*(2*n+1);
            n++;
            pow=-pow;
        }
        System.out.print(s);
    }
    }

