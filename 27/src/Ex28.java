import java.util.Scanner;//+

public class Ex28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double a0, b0, a1, b1, eps = 0.0001;
        a0 = x;
        b0 = 1 - x;
        a1 = a0 * (1 + b0/2);
        b1 = b0 * b0*(3+b0);
        while (b1 > eps) {
            a0 = a1;
            b0 = b1;
            a1 = a0 * (1 + b0 / 2);
            b1 = b0 * b0 * (3 + b0);
        }
        System.out.print(a1);
    }
}
