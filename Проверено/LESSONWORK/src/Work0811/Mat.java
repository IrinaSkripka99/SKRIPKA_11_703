package Work0811;

public class Mat {
    public static void main(String[] args) {
        int n = 5;
        int[] x = {1, 2, 3, 4, 5};
        int[] y = {2, 5, 3, 10, 14};
        int[] x2 = new int[5];
        int sum_x = 0, sum_y = 0, sum_x2 = 0, pr = 1, k, b;
        for (int i = 0; i < x.length; i++) {
            sum_x += x[i];
            x2[i] = x[i] * x[i];
            sum_x2 += x2[i];
        }
        for (int i = 0; i < y.length; i++) {
            sum_y += y[i];
        }
        for (int i = 0; i < n; i++) {
            pr *= x[i] * y[i];
        }
        k = (n * pr - sum_x * sum_y) / (sum_x2 * n - sum_x * sum_x);
        b = (sum_x2 * sum_y - sum_x * pr) / (n * sum_x2 - sum_x * sum_x);
        System.out.print("k="+ k+" " + "b="+b);
    }
}

