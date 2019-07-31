package OOP_1;

public class Test {
    public static void main(String[] args) {
        ThePrintEdition[] catalog = new ThePrintEdition[]{
                new Magazines("Здоровье", 2017, 12),
                new NewsPapers("Комсомольская правда", 2017),
                new Book("Война и мир", "Л.Толстой"),};

        System.out.println("Новинки в мире печати");
        System.out.println();
        for (int i = 0; i < catalog.length; i++) {
            catalog[i].printName(System.out);
            if (catalog[i] instanceof Magazines)
                ((Magazines) catalog[i]).showinfoMagazines(System.out);
            if (catalog[i] instanceof NewsPapers)
                ((NewsPapers) catalog[i]).showInfoNews(System.out);
            if (catalog[i] instanceof Book)
                ((Book) catalog[i]).printAuthors(System.out);

        }


    }
}
