3взжж

public class Sem2 {
    public static void main(String[] args) {
        double z, eps = 1.8, e = 2.7182;
        int n = 14;
        double[] a = new double[n];
        double[] b = new double[n];
        b[0] = 0.25;
        a[0] = -7.18;
        for (int i = 1; i < n; i++) {
            a[i] = Math.pow(e, -(a[i - 1] * a[i - 1] + 2 * b[i - 1] + 0.7));
            if (a[i - 1] < 0) {
                z = Math.sin(a[i - 1]);
                b[i] = z * z;
            } else {
                b[i] = Math.sin((1 + a[i - 1] - b[i - 1]) * b[i - 1]);
            }
        }
        label:
        for (int i = 0; i < n; i++) {
            for (int x = 0; x < n; x++) {
                if (Math.abs(a[i] + b[x]) < eps) {
                    System.out.print(a[i]+" ");
                    break label;
                }
            }
        }
    }
}