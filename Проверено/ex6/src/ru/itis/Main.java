package ru.itis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        double eps=in.nextDouble();
	int n=0,p=1;
	double t=1,s=0;
        while (Math.abs(t)>eps){
            s+=p*t;
            n++;
            t=1.0/((2*n+1)*(2*n+1));
            p=-p;
        }
        System.out.print(s);
    }
}
