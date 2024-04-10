import java.util.Scanner;
public class matrixMultiply {
    public  static void  main(String args[]){
            try (Scanner input = new Scanner(System.in)) {
                int[][] A = { { 1, 2, 3 }, { 4, 5, 6 } };
                int[][] B = { { 7, 8 }, { 9, 10 }, { 11, 12 } };
                int rowsA = A.length;
                int colsA = A[0].length;
                int rowsB = B.length;
                int colsB = B[0].length;

                // Check if matrices are compatible for multiplication (columns of A must equal
                // rows of B)
                if (colsA != rowsB) {
                    throw new IllegalArgumentException("Matrices must have compatible dimensions for multiplication.");
                }

                int[][] C = new int[rowsA][colsB]; // Resultant matrix with dimensions (rows of A) x (columns of B)

                // Perform multiplication for each element in the resultant matrix
                for (int i = 0; i < rowsA; i++) {
                    for (int j = 0; j < colsB; j++) {
                        for (int k = 0; k < colsA; k++) {
                            C[i][j] += A[i][k] * B[k][j];
                        }
                        
                        System.out.print(C[i][j] + " ");
                    }
                    System.out.println();
                }
                
            }
    }


}
