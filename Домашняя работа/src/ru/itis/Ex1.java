package ru.itis;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        switchCase(s);
    }

    public static void switchCase(String s) {
        int state = 0;
        int i = 0;
        boolean f=true;
        while (f) {
            switch (state) {
                case 0:
                    if (s.charAt(i) == 'б') {
                        i++;
                        state=1;
                    } else state = 3;
                case 1:
                    if (s.charAt(i) != 'э') state=3;
                    while (s.charAt(i)=='э') {
                        i++;
                        state=2;
                    }
                case 2:
                    if (s.charAt(i) != '!') {
                        state = 3;
                    }
                    f=false;
            }
        }
        if (state == 3) System.out.println("Все плохо");
        else System.out.println("Все хорошо");
    }
}
