package ru.itis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
        double x=in.nextInt();
        int n=1;
        int pow=1;
        double s=x,eps=0.0001,t=1;
        while(Math.abs(s)>eps){     //почему оценивается сумма?
            t*=1.0*pow*x*x/(2*n+1);   //неверная формула
            n++;
            pow=-pow;
            s+=t;
        }
        System.out.print(s);
    }
    }

