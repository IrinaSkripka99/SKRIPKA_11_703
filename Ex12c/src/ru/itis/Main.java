package ru.itis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x=in.nextInt();
        int n=1;
        int pow=1;
        double eps=0.0001,s=0,t=1;
        while(Math.abs(t)>eps){
            t*=1.0*pow*x;  // договаривались не копить степень в отдельной переменной
            pow=-pow;
            s+=t/n;
            n++;
        }
        System.out.print(s);
    }
}

