package ru.itis;

public class Ex1 {
    public static void main(String[] args) {
        int n = 12,x1,x2;
        double x[] = {-5.3, 4.7, 15.2};
        double y[] = new double[n];
        for (int i = 0; i < n; i++) {
            y[i] = func(2 * i - 7);
        }
        boolean f=false;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < n && !f; j++) {
                x1=2*j-7;
                x2=2*(j+1)-7;
                if (x[i] < x2 && x[i]>=x1){
                    f=true;
                    System.out.println(f(x[i],x1,x2));
                }
            }
            f=false;
        }

    }

    public static double func(double x1) {
        double result ;
        if (x1 < 0) {
            result = Math.log(x1 * x1 + 2.7);
        } else {
            result = Math.log(x1 + 2.7);
        }
        return result;
    }

    public static double f(double x,double x1,double x2){
        return (((x-x2)*func(x1)/(x1-x2))+((x-x1)*func(x2)/(x2-x1)));
    }
}

