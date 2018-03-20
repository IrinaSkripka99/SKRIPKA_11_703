package ru.itis;

//задачи на массивы 2
public class Ex2 {
    public static void main(String[] args) {
        int[][] a = {{1, 2},
                {3, 4}};
        int[][] b = {{4, 3},
                {2, 1}};
 proizvedenie(a, b);
    }

    public static void  proizvedenie(int[][] a, int[][] b) {
        int[][] res = new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                res[i][j] = 0;
                for (int k = 0; k < a.length; k++) {
                    res[i][j] += a[i][k] * a[k][j];
                }
            }
        }
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <b.length ; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
