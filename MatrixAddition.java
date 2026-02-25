public class MatrixAddition {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        System.out.print("Enter the number of rows in Matrix A: ");
        int p = s.nextInt();
        System.out.print("Enter the number of columns in Matrix A: ");
        int q = s.nextInt();

        System.out.print("Enter the number of rows in Matrix B: ");
        int m = s.nextInt();
        System.out.print("Enter the number of columns in Matrix B: ");
        int n = s.nextInt();
        if (p == m && q == n) {
            int[][] A = new int[p][q];
            int[][] B = new int[m][n];
            int[][] sum = new int[p][q];
            System.out.println("Enter the elements of Matrix A:");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    A[i][j] = s.nextInt();
                }
            }
            System.out.println("Enter the elements of Matrix B:");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    B[i][j] = s.nextInt();
                }
            }
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    sum[i][j] = A[i][j] + B[i][j];
                }
            }
            System.out.println("Sum of Matrix");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matrix cannot be added");
        }
        s.close();
    }
}
