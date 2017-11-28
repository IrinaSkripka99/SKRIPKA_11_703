package ru.itis;

public class Class1 {
    public static void main(String[] args) {
        int[] x = {2, 2, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 7};
        int k = 1;
        for (int i = 0; i < 12; i++) {
            if (x[i] != x[i + 1])
                k++;
        }
        System.out.println(k);
    }

}

