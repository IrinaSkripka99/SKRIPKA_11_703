package ru.itis;

public class Ex52 {
    public static void main(String[] args) {
        String s1=new String("cat");
        String s2=new String("blackcat");
        boolean f=false;
        for (int i = 0; i <= s2.length() - s1.length() && !f; i++) {
            f = true;
            for (int j = 0; j < s1.length(); j++) {
                if(s1.charAt(j) != s2.charAt(j+i)){
                    f = false;
                }
            }
        }
        if (f) System.out.println("true");
        else System.out.println("false");
    }
}
