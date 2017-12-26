package ru.itis;
//старая домашняя на 13.12
public class ExOld {

    public static void isGoodWordBySwitch(String text) {
        char array[] = text.toCharArray();
        int state = 0;
        int i = 0;
        int l = text.length();
        int[][] m = {{1, 4, 4},
                {4, 2, 4},
                {4, 2, 3},
                {4, 4, 4},
                {4, 4, 4}};

        boolean isNotFiniteState = true;

        if (l<3) {
            System.out.println("All is bad");
            isNotFiniteState = false;
        }
        while (isNotFiniteState && i < array.length) {
            int t = array[i] - '0';
            state = m[state][t];
            i++;
            if (state == 4) isNotFiniteState = false;
        }
        if (state == 3) System.out.println("All is ok");

        return;
    }


    public static void main(String[] args) {

        String words[] = {"0112", "0", "", "011112", "01", "2"};
        for (int i = 0; i < words.length; i++) {
            isGoodWordBySwitch(words[i]);
            System.out.println();
        }
    }
}


