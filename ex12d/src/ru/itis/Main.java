package ru.itis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x=in.nextInt();
        int n=1;
        int pow=-1;
        int p = 1;
        double s=0,eps=0.0001,t=1;
        while(Math.abs(s)>eps){  //логика неверная
            p*=x*x;
            t*=1.0*pow*p/2*n;  //формула неверная
            n++;
            pow=-pow;
            s+=t;
        }
        System.out.print(s);
    }
}

