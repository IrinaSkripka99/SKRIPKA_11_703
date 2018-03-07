package ru.itis.Sem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GraphicPic {

    public Segment getHead() {
        return head;
    }

    public static class Segment {
        private int x1;
        private int x2;
        private int y1;
        private int y2;
        double length;
        Segment next;

        public Segment getNext() {
            return next;
        }

        public Segment(int x1, int y1, int x2, int y2) {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
            length = lengthSeg();
        }

        public double lengthSeg() {
            int dl = (x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1);
            double lengthS = Math.sqrt(dl);
            return lengthS;
        }

        public int getX1() {
            return x1;
        }

        public int getX2() {
            return x2;
        }

        public int getY1() {
            return y1;
        }

        public int getY2() {
            return y2;
        }

        public double getLength() {
            return length;
        }
    }

    private Segment head;
    private Segment tail;


    public GraphicPic(String fileName) throws FileNotFoundException {
        Scanner file = new Scanner(new File(fileName));
        String current = file.nextLine();
        Segment newSegment = new Segment(Integer.parseInt(current.split(" ")[0]), Integer.parseInt(current.split(" ")[1]),
                Integer.parseInt(current.split(" ")[2]), Integer.parseInt(current.split(" ")[3]));
        head = newSegment;
        tail = newSegment;
        while (file.hasNext()) {
            current = file.nextLine();
            newSegment = new Segment(Integer.parseInt(current.split(" ")[0]), Integer.parseInt(current.split(" ")[1]),
                    Integer.parseInt(current.split(" ")[2]), Integer.parseInt(current.split(" ")[3]));
            insert(newSegment);
        }

    }

    //void insert(Segment f): вставка отрезка в список.
    //При вставке учесть, существует ли подобный элемент в списке, если да – то не добавлять;

    public void insert(Segment f) {
        Segment current = head;
        while (current != null) {
            if ((current.getX1() == f.getX1()) & (current.getX2() == f.getX2()) & (current.getY1() == f.getY1()) &
                    (current.getY2() == f.getY2())) {
                System.out.println("Такой отрезок уже есть");
                return;
            }
            current = current.next;
        }
        tail.next = f;
        tail = f;

    }

    //void show(): вывод всех отрезков и информации о них на экран;

    public void show() {
        Segment current = head;
        while (current != null) {
            System.out.println("Координаты отрезка : первая верщина(" + current.x1 + "," + current.y1 + "), вторая(" + current.x2 + "," + current.y2 + ")");
            current = current.next;
        }

    }

    public void add(Segment f) {

        if (head == null) {
            head = f;
            tail = f;
        } else {
            tail.next = f;
            tail = f;
        }
    }

    //GraphicPic angleList(): построить новый список, состоящий из отрезков,
    // которые наклонены к оси абсцисс под углами 30 и 45 градусов

    public GraphicPic angleList() {
        GraphicPic newList = new GraphicPic();
        double cos, cos30, cos45;
        Segment current = head;
        cos30 = Math.sqrt(3) / 2;
        cos45 = Math.sqrt(2) / 2;
        int quantity = 0;
        while (current != null) {
            int SegLength=Math.abs(current.x1 - current.x2);
            cos =  SegLength/ current.getLength();
            if (cos == cos30 || cos == cos45) {
                Segment f = new Segment(current.x1, current.y1, current.x2, current.y2);
                newList.add(f);
                quantity++;
            }
            current = current.next;
        }
        if (quantity == 0) System.out.println("Таких отрезков нету");
        return newList;
    }

    public GraphicPic() {

    }

    //GraphicPic lengthList(int a, int b): построить новый список из
    //отрезков, длина которых находится в интервале [a,b]

    public GraphicPic lengthList(int a, int b) {
        GraphicPic picList = new GraphicPic();
        int quantity = 0;
        Segment current = head;
        while (current != null) {
            if (current.getLength() >= a && current.getLength() <= b) {
                Segment f = new Segment(current.x1, current.y1, current.x2, current.y2);
                picList.add(f);
                quantity++;
            }
            current = current.next;
        }
        if (quantity == 0) System.out.println("Таких отрезков нету");
        return picList;
    }

    //void sort(): упорядочить список отрезков по возрастанию длин

    public void sort() {
        Segment following;
        Segment current = head;
        while (current.next != null) {
            following = current.next;
            while (following != null) {
                if (current.length > following.length) {
                    Segment t = new Segment(current.x1, current.y1, current.x2, current.y2);
                    current.y1 = following.y1;
                    current.y2 = following.y2;
                    current.x1 = following.x1;
                    current.x2 = following.x2;
                    current.length = following.length;

                    following.x2 = t.x2;
                    following.x1 = t.x1;
                    following.y2 = t.y2;
                    following.y1 = t.y1;
                    following.length = t.length;
                }
                following = following.next;
            }
            current = current.next;
        }
    }
}

