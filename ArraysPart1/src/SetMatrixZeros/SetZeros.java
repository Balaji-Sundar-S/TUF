package SetMatrixZeros;

import java.util.Random;

/*PS: Given a matrix if an element in the matrix is 0 then you will have to set its entire column 
and row to 0 and then return the matrix.*/
public class SetZeros {

    Random r = new Random();

    public void DisplayMatrix(int[][] matrix, String displayMessage) {
        System.out.println(displayMessage);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] FillMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int r1 = r.nextInt(2);
                matrix[i][j] = r1;
            }
        }
        return matrix;
    }

    public void FindZeros() {
        int[][] mat = new int[3][3];
        int[] row = new int[3];
        int[] col = new int[3];
        int[][] matrix = FillMatrix(mat);
        DisplayMatrix(matrix, "Initial Matrix");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }

        DisplayMatrix(matrix, "Final Matrix");
    }
}
