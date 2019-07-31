package Interfaces;

public class MusicInst implements Info {
    public String name;
    public int price;
    public String sound;

    public MusicInst(String name, int price, String sound) {
        this.name = name;
        this.price = price;
        this.sound = sound;
    }

    public void showInfo() {
        System.out.println("Инструмент " + name + ":");
        System.out.println("Стоимость = " + price);
        System.out.println("Играет вот так : " + sound);
        System.out.println();
    }
}
