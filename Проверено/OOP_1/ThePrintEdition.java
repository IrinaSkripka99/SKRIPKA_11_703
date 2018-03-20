package OOP_1;

import java.io.PrintStream;

public class ThePrintEdition {
    String name;

    public ThePrintEdition(String name) {

        this.name = name;
    }

    public void printName(PrintStream out) {
        out.print("Название:");
        out.println(name);
    }
}

