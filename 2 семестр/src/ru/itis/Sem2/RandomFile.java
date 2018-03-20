package ru.itis.Sem2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;


public class RandomFile {

    private String fileName;
    private ArrayList<String> notExist;

    public RandomFile(String fileName) {
        this.fileName = fileName;
    }

    private void numGenerator() {
        notExist = new ArrayList();
        Random r = new Random();
        boolean hasEquals = false;
        int numOf = 100 + r.nextInt(1000);
        int arrayLength = 50 + r.nextInt(100);
        for (int count = 0; count < arrayLength; count++) {
            String toAdd = "";
            for (int inCount = 0; inCount < numOf; inCount++) {
                toAdd += (-100 + r.nextInt(500)) + " ";
            }
            for (String current : notExist) {
                if (toAdd.equals(current)) {
                    count--;
                    hasEquals = true;
                    break;
                }
            }
            if (!hasEquals) notExist.add(toAdd);
        }
    }

    public void writeToFile() throws IOException {
        numGenerator();
        BufferedWriter file = new BufferedWriter(new FileWriter(fileName));
        for (String current : notExist) {
            file.write(current);
            file.newLine();
        }
        file.close();
    }
}