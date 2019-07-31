package Work2911;

import java.util.Scanner;

public class Ex4 {
    static Scanner in =new Scanner(System.in);

    public static void main(String[] args) {
        String s="Ирина супер";
        for (int i = 1; i <=s.length(); i++) {
            System.out.print(s.charAt(s.length()-i));
        }
    }
}
