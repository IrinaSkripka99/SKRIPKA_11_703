import java.util.Scanner;

public class Ex12g {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        double x=in.nextInt();
        int n=1;
        int pow=-1;
        double eps=0.0001,t=1,s=0;
        while(Math.abs(t)>eps){
            s+=t;
            t*=(1.0*pow*x*x)/((2*n)*(2*n-1));
            n++;
            pow=-pow;
        }
        System.out.print(s);
    }
}