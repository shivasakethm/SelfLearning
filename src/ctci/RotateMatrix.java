package ctci;

public class RotateMatrix {
    public static boolean rotate(int[][] matrix) {
        if (matrix.length == 0 || matrix.length != matrix[0].length) return false; // Not a square
        int n = matrix.length;

        for (int layer = 0; layer < n / 2; layer++) {
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                int top = matrix[first][i]; // save top

                // left -> top
                matrix[first][i] = matrix[last - offset][first];

                // bottom -> left
                matrix[last - offset][first] = matrix[last][last - offset];

                // right -> bottom
                matrix[last][last - offset] = matrix[i][last];

                // top -> right
                matrix[i][last] = top; // right <- saved top
            }
        }
        return true;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void mySolution(int[][] matrix) {
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = matrix.length - 1; j >= 0; j--) {
                System.out.print(matrix[j][i]);
                System.out.print(" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{0, 1, 2, 3, 16}, {4, 5, 6, 7, 17}, {8, 9, 10, 11, 18}, {12, 13, 14, 15, 19}, {20, 21, 22, 23, 24}};
        int[][] matrix1 = {{0, 1, 2, 3, 16}, {4, 5, 6, 7, 17}, {8, 9, 10, 11, 18}, {12, 13, 14, 15, 19}, {20, 21, 22, 23, 24}};
        printMatrix(matrix);
        long start = System.currentTimeMillis();
        rotate(matrix);
        long end = System.currentTimeMillis();
        System.out.println("Counting to 10000000 takes " + (end - start) + "ms");
        System.out.println();
        printMatrix(matrix);
        long start1 = System.currentTimeMillis();
        mySolution(matrix1);
        long end1 = System.currentTimeMillis();
        System.out.println("Counting to 10000000 takes " + (end1 - start1) + "ms");
    }
}

//0 1 2 3
//        4 5 6 7
//        8 9 10 11
//        12 13 14 15
//
//        12 8 4 0
//        13 9 5 1
//        14 10 6 2
//        15 11 7 3