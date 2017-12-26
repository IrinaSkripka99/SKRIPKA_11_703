package stroki;
//строки
import java.util.Scanner;

public class Ex214 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = new String();
        s = in.next();
        String[] str = s.split(" ");
        for (int i = 0; i <str.length ; i++) {
            if (str[i].charAt(0) == str[i].charAt(str[i].length()-1)) System.out.println(str[i]);
        }

    }
}
