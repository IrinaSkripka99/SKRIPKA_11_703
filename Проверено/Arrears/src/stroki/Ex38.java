package stroki;
//строки
import java.util.Scanner;

public class Ex38 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s =in.next();
        boolean f = false;
        for (int i = 1; i < s.length() && !f; i++) {
            if ((s.charAt(i) % 2 == 0) || (s.charAt(i) % 3 == 0)) {
                f = true;
            }
        }
        System.out.println(f);
    }
}

