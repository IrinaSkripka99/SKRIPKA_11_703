package ru.itis;
import java.util.Scanner;
public class B20_2 {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x=in.nextDouble();
        int n=in.nextInt(),i=2,p=2;
        double s=(x+Math.cos(x))/p;
        while(i<=n){
            p=p*2;
            s+=(x+Math.cos(x*i))/p;
            i++;
        }
        System.out.println(s);
    }
}
