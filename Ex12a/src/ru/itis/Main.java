package ru.itis;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int x=in.nextInt();
	int n=1;
	double eps=0.0001,s=0,t=1;
	while(Math.abs(t)>eps){
	  s+=t;
	  t=1.0*t*x/n;
	  n++;
    }
    System.out.print(s);
    }
}
