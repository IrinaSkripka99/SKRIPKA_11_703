package OOP_1;

import java.io.PrintStream;

public class NewsPapers extends ThePrintEdition {
    int year;

    public NewsPapers(String name,int year) {
        super(name);
        this.year = year;
    }
    public void showInfoNews(PrintStream out){
        out.print("Год выпуска:");
        out.println(year);
    }
}
