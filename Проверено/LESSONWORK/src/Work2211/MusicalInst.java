package Work2211;


public class MusicalInst {
    public static void main(String[] args) {
        Instrument violin = new Instrument();
        Person seller = new Person();
        violin.name = "скрипка";
        violin.sound = "лалала";
        violin.price = 84067;
        Instrument guitar = new Instrument();
        guitar.name = "гитара";
        guitar.sound = "праам";
        guitar.price = 12696;
        Instrument drums = new Instrument();
        drums.name = "барабан";
        drums.sound = "тунтун";
        drums.price = 49990;
        seller.sayHello();
    }

}

class Instrument {
    String name;
    String sound;
    int price;
    void answer() {
        System.out.println(name + " стоит " + price + " и играет вот так " + sound);
    }
}

class Person {

    void sayHello() {
        System.out.println("Здравствуйте,что вас интересует?");
    }


}

