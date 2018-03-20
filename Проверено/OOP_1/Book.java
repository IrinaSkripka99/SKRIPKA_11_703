package OOP_1;


import java.io.PrintStream;

public class Book extends ThePrintEdition {
    String authors;

    public Book(String name, String authors) {
        super(name);
        this.authors = authors;
    }

    public void printAuthors(PrintStream out) {
        out.print("Автор:");
        out.println(authors);
    }

}
