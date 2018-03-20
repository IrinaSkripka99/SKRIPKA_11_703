import java.util.Scanner;

public class Ex11d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double s = 1;
        double p = 1;
        for (int k = 1; k <= n; k++) {
            p *= Math.sin(k) / Math.cos(k);
            s *= p;
        }
        System.out.println(s);
    }
}