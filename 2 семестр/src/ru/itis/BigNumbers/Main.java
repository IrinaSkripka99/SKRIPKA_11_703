package ru.itis.BigNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        Number.makeEqualByLength(str1, str2);
        String sum = Number.summa(str1, str2);
        String mul=Number.multiplication(str1,str2);
        System.out.println("Сумма чисел равна: " +'\n' + sum);
        System.out.println("Их произведение: " +'\n' + mul);
    }
}
