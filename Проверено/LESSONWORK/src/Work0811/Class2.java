package Work0811;

import java.util.Scanner;

public class Class2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int matrix[][];
        matrix = new int[3][2];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                if (matrix[i][j]<min) {
                    min = matrix[i][j];
                }
            }
            System.out.print(min);
        }

    }
}



