package ru.itis;

public class Ex34 {
    public static void main(String[] args) {
        String str = new String("12586");
        char max = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) > max) {
                max = str.charAt(i);
            }
        }
        System.out.println(max);
    }
}
