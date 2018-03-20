package ru.itis.Work1403;

import jdk.nashorn.internal.runtime.regexp.joni.exception.SyntaxException;

public class Compirer {

    public void analyze(String input) {
        boolean flag = true;
        if (!input.matches("A-Z")) flag = false;
        char array[] = input.toCharArray();
        int state = 0;
        int i = 0;

        while ((i < 1) & flag) {
            switch (state) {
                case 0:

            }
        }
        if (!flag) {
            throw new SyntaxException("Строка написано неправильно");
        }


    }
}
