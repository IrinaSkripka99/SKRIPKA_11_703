package ru.itis.Sem2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String args[]) throws IOException {
        RandomFile randomFileCreator = new RandomFile("Arrays.txt");
        randomFileCreator.writeToFile();
        Scanner sc = new Scanner(new File("Arrays.txt"));
        long beginTime= System.currentTimeMillis();
        sort(sc);
        long endTime = System.currentTimeMillis();
        System.out.println("Time "+(endTime-beginTime));
    }

    public static void sort(Scanner sc) throws IOException {
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            Tree tree = new Tree(Integer.valueOf(arr[0]));
            for (int i = 1; i < arr.length; i++) {
                tree.insert(new Tree(Integer.valueOf(arr[i])));
            }
            tree.print();
            System.out.println();
        }
    }
}



