package ru.itis.Sem;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        GraphicPic pic = new GraphicPic("input.txt");
        GraphicPic.Segment f = new GraphicPic.Segment(1, 2, 4,6 );
        pic.show();
        System.out.println();
        System.out.println("Добавление одного отрезка");
        pic.insert(f);
        pic.show();
        System.out.println();
        System.out.println("Отрезки,наклоненные к оси абцисс под углом 45 или 35 градусов:");
        GraphicPic picAngle = pic.angleList();
        picAngle.show();
        System.out.println();
        System.out.println("Отрезки,входящие в заданный интервал:");
        GraphicPic picList = pic.lengthList(2, 10);
        picList.show();
        System.out.println();
        System.out.println("Отсортированный список по длинам");
        pic.sort();
        pic.show();
        int i = 0;


    }
}
