package Work2911;

public class Array {
    public static void main(String[] args) {

        int matrix[][] = new int[][]{
                {1, 2, 1},
                {3, 4, 1},
                {4, 3, 2}
        };
        int max = findMin(matrix[0]);
        for (int i = 0; i < matrix.length; i++) {
            int minI = findMin(matrix[i]);
            if (max < minI) max = minI;
        }

        System.out.println(max);
    }
    private static int findMin(int[] row) {
        int min = row[0];
        for (int i = 0; i < row.length; i++) {
            if (row[i] < min) min = row[i];
        }
        return min;
    }
}
