import java.util.Scanner;

class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first matrix (A)
        System.out.print("Enter number of rows for matrix A: ");
        int m = scanner.nextInt();
        System.out.print("Enter number of columns for matrix A: ");
        int n = scanner.nextInt();

        int[][] A = new int[m][n];
        System.out.println("Enter elements of matrix A:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // Input for the second matrix (B)
        System.out.print("Enter number of rows for matrix B: ");
        int n2 = scanner.nextInt(); // This should be the same as the number of columns in matrix A
        System.out.print("Enter number of columns for matrix B: ");
        int p = scanner.nextInt();

        // Make sure the number of columns in A is equal to the number of rows in B
        if (n != n2) {
            System.out.println("Matrix multiplication is not possible. The number of columns in A must be equal to the number of rows in B.");
            return;
        }

        int[][] B = new int[n2][p];
        System.out.println("Enter elements of matrix B:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < p; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // Initialize the result matrix C
        int[][] C = new int[m][p];

        // Matrix multiplication
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Output the result matrix C
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < m; i++) {
 for (int j = 0; j < p; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 
