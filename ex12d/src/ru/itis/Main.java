package ru.itis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x=in.nextInt();
        int n=1;
        int pow=-1;
        double eps=0.0001,t=(x*x)/2,s;
        s=1-t;
        while(Math.abs(t)>eps){
            t*=((1.0*pow*x*x)/(2*n));
            n++;
            pow=-pow;
            s+=t;
        }
        System.out.print(s);
    }
}

