package ASSIGNMENTS.MULTIDIMENSIONAL_ARRAY;

public class set_Rows_O {
        public static void setMatrixZeroes(int[][] matrix) {
            int rows = matrix.length;
            int cols = matrix[0].length;
            boolean[] zeroRows = new boolean[rows];
            boolean[] zeroCols = new boolean[cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (matrix[i][j] == 0) {
                        zeroRows[i] = true;
                        zeroCols[j] = true;
                    }
                }
            }
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    if (zeroRows[i] || zeroCols[j]) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        public static void main(String[] args) {
            int[][] matrix = {
                    {1, 1, 1},
                    {1, 0, 1},
                    {1, 1, 1}
            };
            setMatrixZeroes(matrix);
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    }
}
