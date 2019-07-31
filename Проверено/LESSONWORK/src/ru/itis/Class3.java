package ru.itis;

public class Class3 {
    public static void main(String[] args) {
        int[] x = {2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7};
        int[] w = new int[x.length];
        if (x[0] != x[1]) w[0] = 1;
        if ((x[x.length - 2]) != (x[x.length-1])) w[x.length-1] = 1;
        for (int i = 1; i < x.length - 1; i++) {
            if (x[i] != x[i - 1] && x[i] != x[i + 1]) w[i] = 1;
            else w[i] = 0;
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(w[i]+ " ");
        }
    }
}
