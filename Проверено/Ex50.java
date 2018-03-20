package ru.itis;

public class Ex50 {
    public static void main(String[] args) {
    String s1 = new String("hello");
    String s2 = new String("hello");
    boolean f = true;
    for (int i = 0; i < s1.length() && f; i++) {
        if (s1.charAt(i) != s2.charAt(i)) {
            f = false;
        }
    }
    if (f) System.out.println("true");
    else System.out.println("false");
}
}
