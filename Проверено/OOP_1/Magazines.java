package OOP_1;

import java.io.PrintStream;

public class Magazines extends ThePrintEdition {
    int year;
    int number;

    public Magazines(String name, int year, int number) {
        super(name);
        this.year = year;
        this.number = number;
    }

    public void showinfoMagazines(PrintStream out) {
        out.print("Номер и год выпуска:");
        out.println(number +" " +year);
    }
}
