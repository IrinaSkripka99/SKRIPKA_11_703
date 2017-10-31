package ru.itis;

public class Ex8_1 {
    public static void main(String[] args) {

        int[] b = new int[9];

        int[] s = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] T1 = {0, 1, 6, 10};

        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < s.length; i++) {
            System.out.print(T1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < s.length; i++) {
            if (exists(T1, s[i])) {
                b[i] = 1;
            } else {
                b[i] = 0;
            }
            System.out.print(b[i] + " ");
        }
    }
    public static boolean exists(int[] T, int x) {
        for (int i = 0; i < T.length; i++) {
            if (T[i] == x) return true;
        }
        return false;
    }
}

