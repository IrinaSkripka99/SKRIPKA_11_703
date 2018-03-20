//  22ж
package ru.itis;
import java.util.Random;
import java.util.Scanner;

public class Ex22g {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int p = 0;
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(20);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            if (a[i] <= 1) p += 0;
            if ((a[i] == 2) || (a[i] == 3) || (a[i] == 5) || (a[i] == 7)) p += 1;
            else {
                if ((a[i] % 2 != 0) & (a[i] % 3 != 0) & (a[i] % 5 != 0) & (a[i] % 7 != 0))
                    p += 1;
            }
        }
        System.out.println(p);
    }
}

