package ru.itis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
        int x=in.nextInt();
        int n=1;
        int pow=-1;
        double s=0,t=1;
        while(Math.abs(t)>Math.sin(x)){
            s+=t;
            t*=1.0*pow*x*x/(2*n+1);
            n++;
            pow=-1;
        }
        System.out.print(s);
    }
    }

