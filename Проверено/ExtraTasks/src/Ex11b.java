import java.util.Scanner;

public class Ex11b {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double sum = 0;
        double p = 1;
        for (int k = 0; k <= n; k++) {
            p *= Math.cos(k) / Math.sin(k);
            sum += p;
        }
        System.out.println(sum);
    }
}
