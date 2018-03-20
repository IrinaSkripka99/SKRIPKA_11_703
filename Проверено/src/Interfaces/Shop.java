package Interfaces;

public class Shop {
    public static void main(String[] args) {
        MusicInst guitar = new MusicInst("гитара", 12000, "лалала");
        MusicInst violin = new MusicInst("скрипка", 20900, "прямпрям");
        MusicInst drum = new MusicInst("барабан", 7080, "брумбоум");
        outputInfo(guitar);
        outputInfo(violin);
        outputInfo(drum);
    }
    public static void outputInfo(Info info){

        info.showInfo();
    }
}
