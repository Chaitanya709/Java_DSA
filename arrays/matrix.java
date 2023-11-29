import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[][] = new int[n][n];
        int count = 0;

        // Input the matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }

        // Create a copy of the original matrix
        int b[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = a[i][j];
            }
        }

        // Modify the original matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 0) {
                    // Check bounds before setting neighbors to 0
                    if (j > 0) b[i][j - 1] = 0;  // Left neighbor
                    if (j < n - 1) b[i][j + 1] = 0;  // Right neighbor
                    if (i > 0) b[i - 1][j] = 0;  // Upper neighbor
                    if (i < n - 1) b[i + 1][j] = 0;  // Lower neighbor
                }
            }
        }

        // Print the modified matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
