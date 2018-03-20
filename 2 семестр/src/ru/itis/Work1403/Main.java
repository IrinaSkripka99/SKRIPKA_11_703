package ru.itis.Work1403;

public class Main {
    public static void main(String[] args) {
     String str=new String("X1:=5;X2:=123;X3=X2+X1;A1:=X4;");
     Compirer compirer=new Compirer();
     compirer.analyze(str);
    }
}
