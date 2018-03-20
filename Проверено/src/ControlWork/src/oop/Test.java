package oop;

public class Test { public static void main(String[] args) {

    //Инициализация случайными числами
    Furniture[] objects = new Furniture[6];

    int height = (int) (Math.random() * 30) + 10;
    int width = (int) (Math.random() * 30) + 10;
    int depth = (int) (Math.random() * 30) + 10;
    objects[0] = new Bookcase(height, width, depth, "Дерево", 30);
    objects[1] = new Bookcase(height, width, depth, "Дерево", 30);

    height = (int) Math.random() * 30 + 12;
    width = (int) Math.random() * 30 + 12;
    depth = (int) Math.random() * 30 + 12;
    objects[2] = new Closet(height, width, depth, "Дерево", 30);
    objects[3] = new Closet(height, width, depth, "Дерево", 30);

    height = (int) (Math.random() * 30) + 14;
    width = (int) (Math.random() * 30) + 14;
    depth = (int) (Math.random() * 30) + 14;
    objects[4] = new Chair(height, width, depth, "Дерево", 30);

    height = (int) (Math.random() * 30) + 10;
    width = (int) (Math.random() * 30) + 20;
    depth = (int) (Math.random() * 30) + 20;
    objects[5] = new Desk(height, width, depth, "Дерево", 30);

    height = (int) (Math.random() * 40) + 75;
    width = (int) (Math.random() * 40) + 90;
    depth = (int) (Math.random() * 40) + 90;
    Car[] cars = new Car[2];
    cars[0] = new Car(height, width, depth);
    cars[1] = new Car(height, width, depth);

    loop:
    for (int i = 0; i < objects.length; i++) {
        if(cars[0].isFitable(objects[0])){
            cars[0].put(objects[i]);
        }
        else if(cars[1].isFitable(objects[1])){
            cars[1].put(objects[i]);
        }
        else {
            System.out.println("Не поместилось");
            break loop;
        }
        if(i==5){
            System.out.println("Поместилось");
        }
    }
}
}
