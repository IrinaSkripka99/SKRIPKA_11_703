import java.util.Scanner;

public class Ex9a {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = 2,pow = 1;
        double s=1,t=s;
        int n = in.nextInt();
        while (m < n) {
            t = 1.0*pow / (m * m);
            s += t;
            pow = -pow;
            m++;
        }
    }
}
