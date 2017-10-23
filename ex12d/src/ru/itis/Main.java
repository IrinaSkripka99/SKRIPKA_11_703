package ru.itis;//-
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x=in.nextInt();
        int n=1;
        int pow=-1;
        double eps=0.0001,t=1,s=0;
        while(Math.abs(t)>eps){
            s+=t;
            t*=((1.0*pow*x*x)/(2*n));//неверная формула
            n++;
            pow=-pow;
        }
        System.out.print(s);
    }
}

