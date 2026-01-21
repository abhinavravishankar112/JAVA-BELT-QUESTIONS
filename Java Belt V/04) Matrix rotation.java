import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        // Read matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Print rotated matrix
        for (int col = 0; col < n; col++) {
            for (int row = n - 1; row >= 0; row--) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
