package ru.itis.Sem;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.Assert.assertTrue;

public class PicTest {

    GraphicPic helper;


    @Before
    public void setUp() throws FileNotFoundException {
        helper = new GraphicPic("input.txt");
    }

    @Test
    public void insertTest() {
        GraphicPic.Segment f = new GraphicPic.Segment(2, 4, 6, 8);
        helper.insert(f);
        GraphicPic.Segment current = helper.getHead();
        while (current.getNext() != null) {
            current = current.getNext();
        }
        boolean equals;
        if (current.getY1() == f.getY1() && current.getY2() == f.getY2() && current.getX2()
                == f.getX2() && current.getX1() == f.getX1()) {
            equals = true;
        } else equals = false;
        assertTrue(equals);
    }

    @Test
    public void showTest() {
        boolean equals = true;
        helper.sort();
        GraphicPic.Segment current = helper.getHead();
        while (current.next != null) {
            if (current.getLength() > current.next.getLength()) {
                equals = false;
            }
            current = current.getNext();
        }
        assertTrue(equals);
    }

    @Test

    public void graphicPicTest() {
        GraphicPic.Segment current = helper.getHead();
        boolean equals = true;
        try {
            Scanner file = new Scanner(new File("input.txt"));
            while (current != null || file.hasNext()) {
                String[] currentLine = file.nextLine().split(" ");
                if (current.getX1() != Integer.parseInt(currentLine[0]) || current.getY1() != Integer.parseInt(currentLine[1]) ||
                        current.getX2() != Integer.parseInt(currentLine[2]) || current.getY2() != Integer.parseInt(currentLine[3]))
                    equals = false;
                current = current.getNext();
            }
        } catch (FileNotFoundException e) {
            equals = false;
        }
        assertTrue(equals);
    }

    @Test
    public void angleListTest() {
        boolean equals = true;
        helper = helper.angleList();
        GraphicPic.Segment current = helper.getHead();
        double cos, cos30, cos45;
        cos30 = Math.sqrt(3) / 2;
        cos45 = Math.sqrt(2) / 2;
        while (current != null && equals) {
            int SegLength=Math.abs(current.getX1() - current.getX2());
            cos =  SegLength/ current.getLength();
            if (cos != cos30 & cos != cos45) equals=false;
            current = current.next;
        }
        assertTrue(equals);
    }

    @Test
    public void lengthListTest() {
        boolean equals = true;
        GraphicPic picL = helper.lengthList(2, 10);
        GraphicPic.Segment current = picL.getHead();
        while (current != null && equals) {
            if (current.getLength() >= 2 && current.getLength() <= 10) {
                current = current.next;
            } else equals = false;
        }
        assertTrue(equals);
    }
}


