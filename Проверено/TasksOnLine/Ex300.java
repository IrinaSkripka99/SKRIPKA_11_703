package TasksOnLine;

import java.util.Scanner;

public class Ex300 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String password = in.nextLine();
        CheckPassword(password);
    }

    public static void CheckPassword(String password) {
        boolean good = true;
        if (password.length() >= 8 && password.length() < 100) {
            for (int i = 0; i < password.length() && good; i++) {

            }
        }
    }
}
