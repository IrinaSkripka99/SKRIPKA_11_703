package ru.itis;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int k = 1;
        int fac = 1;
        double sum = 1;
        while (k <= n){
            sum = sum + ((( Math.pow((-1), k)) * (Math.pow(x, 2 * k + 1))) / (double)(fac * ((2 * k) + 1)));
            k++;
            fac *= k;
        }
        System.out.println(sum);

    }


}
