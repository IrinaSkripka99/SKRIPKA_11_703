package ru.itis.BigNumbers;

public class Number {

    public static String makeEqualByLength(String str1, String str2) {
        int length = Math.abs(str1.length() - str2.length());
        if (str1.length() > str2.length()) {
            for (int i = 0; i < length; i++) {
                str2 = "0" + str2;
            }
            return str2;
        } else {
            for (int i = 0; i < length; i++) {
                str1 = "0" + str1;
            }
            return str1;
        }
    }

    public static String summa(String a, String b) {
        String firstNumber = a;
        String secondNumber = b;
        byte mind = 0;
        StringBuilder result = new StringBuilder();
        if (a.length() > b.length()) {
            secondNumber = makeEqualByLength(a, b);
        } else {
            firstNumber = makeEqualByLength(a, b);
        }
        for (int i = firstNumber.length() - 1; i >= 0; i--) {
            int sum = Character.getNumericValue(firstNumber.charAt(i)) + Character.getNumericValue(secondNumber.charAt(i)) + mind;
            mind = 0;
            if (sum <= 9) {
                result.insert(0, sum);
            } else {
                sum %= 10;
                mind = 1;
                result.insert(0, sum);
            }
        }
        if (mind != 0) {
            result.insert(0, mind);
        }

        firstNumber = result.toString();
        return firstNumber;
    }

    public static String multiplication(String a, String b) {
        String firstNumber = a;
        String secondNumber = b;
        byte mind = 0;
        StringBuilder result = new StringBuilder();
        if (a.length() > b.length()) {
            secondNumber = makeEqualByLength(a, b);
        } else {
            firstNumber = makeEqualByLength(a, b);
        }
        for (int i = secondNumber.length() - 1; i >= 0; i--) {
            for (int j = firstNumber.length() - 1; j >= 0; j--) {
                int sum = Character.getNumericValue(firstNumber.charAt(i)) * Character.getNumericValue(secondNumber.charAt(j)) + mind;
                mind = 0;
                if (sum <= 9) {
                    result.insert(0, sum);
                } else {
                    sum %= 10;
                    mind = 1;
                    result.insert(0, sum);
                }
            }
        }

        if (mind != 0) {
            result.insert(0, mind);
        }


        firstNumber = result.toString();

        return firstNumber;
    }

}