package ctci;

public class ZeroMatrix {
    static void zeroingMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] rowList = new boolean[rows];
        boolean[] colList = new boolean[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowList[i] = true;
                    colList[j] = true;

                }
            }
        }
        for (int i = 0; i < rowList.length; i++) {
            if (rowList[i]) {
                zeroRow(matrix, i);
            }
        }
        for (int i = 0; i < colList.length; i++) {
            if (colList[i]) {
                zeroColumn(matrix, i);
            }
        }
        return;

    }

    static void zeroRow(int[][] matrix, int i) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[i][j] = 0;
        }

    }

    static void zeroColumn(int[][] matrix, int i) {
        for (int j = 0; j < matrix.length; j++) {
            matrix[j][i] = 0;
        }

    }

    public static void main(String[] args) {

        int[][] matrix = {{0, 1, 2, 3, 16}, {4, 5, 6, 7, 17}, {8, 9, 0, 11, 18}, {12, 13, 14, 15, 19}};
        RotateMatrix.printMatrix(matrix);
        zeroingMatrix(matrix);
        RotateMatrix.printMatrix(matrix);

    }
}
