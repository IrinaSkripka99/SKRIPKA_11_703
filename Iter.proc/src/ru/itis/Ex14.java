package ru.itis;//+
import java.util.Scanner;
public class Ex14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int col = 0;
        for (int i = 1; n > 0; i++) {
            n /= 10;
            col = i;
        }
        System.out.println(col);
    }
}
