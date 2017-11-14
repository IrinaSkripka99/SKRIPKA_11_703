package ru.itis;

public class Ex15a {

    public static void main(String[] args) {
        int[] a = {1, 4, 5, 8, 2, 3, 6, 1, 2, 0, 3, 7};
        int l = 1, s = a.length, t = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] <= a[i + 1]) l++;
            else {
                if (l < s) s = l;
                if (l > t) t = l;
                l=1;
            }
        }
        System.out.println("самая короткая-" + s + " " + "самая длинная-" + t);
    }
}
 // на этом массиве int[] a = {1, 4, 5, 8, 2, 3, 6, 1, 2, 0, 3, 7, 2}; получаем ответ
 //       самая короткая-2 самая длинная-4 это неверно
