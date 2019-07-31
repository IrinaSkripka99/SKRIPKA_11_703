package ru.itis;

import java.util.Scanner;

public class Ex256 {


    protected static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static final int n = 26;
    public static final int k = 1;


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); ++i) {
            char c = input.charAt(i);
            int y = (findIndAlphabet(c) + k) % n;
            output.append(alphabet[y]);

        }
        System.out.println(output.toString());
    }

    public static int findIndAlphabet(char c) {
        int rez = -1;

        for (int i = 0; i < alphabet.length; ++i) {
            if (c == alphabet[i]) rez = i;
        }
        return rez;
    }

}