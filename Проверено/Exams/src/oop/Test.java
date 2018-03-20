package oop;

public class Test {
    public static void main(String[] args) {
        RationalFrac number=new RationalFrac(7,8);
        System.out.println("Правильная дробь");
        number.CorrectForm(7,8);
        System.out.println("Вычитание");
        number.Subtraction(7,8,2,16);
        System.out.println("Деление");
        number.Division(7,8,2,16);
    }
}
