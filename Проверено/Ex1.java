package ru.itis;

public class Ex1 {
    public static void main(String[] args) {
        String words[] = {"011", "0","010", "01", "101"};
        for (int i = 0; i < words.length; i++) {
            isGoodWordBySwitch(words[i]);
        }
    }

    public static void isGoodWordBySwitch(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int l = text.length();
        int[][] m = {{0, 1, 3},
                     {2, 1, 3}};
        boolean isNotFiniteState = true;

        if (l < 2) {
            System.out.println("All is bad");
            isNotFiniteState = false;
        }
        while (isNotFiniteState && i < array.length) {
            state = m[state][i];
            i++;
            if (state == 3) isNotFiniteState = false;
        }
        if (state == 2) System.out.println("All is ok");

        return;
    }
}