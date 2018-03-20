package stroki;
//строки
import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next(), s1[] = s.split(" ");
        int min = s1[0].length();
        for (int i = 1; i < s1.length; i++) {
            if (s1[i].length() < min) {
                min = s1[i].length();
            }
        }
        System.out.println(min);
    }
}
