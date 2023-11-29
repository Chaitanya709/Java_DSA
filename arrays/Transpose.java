import java.util.Scanner;

public class Transpose {
    public static void main (String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }

        int b[][] = new int[n][n];
        for (int i = n - 1; i >= 0; i--) { // Start from the last row and go up
            for (int j = 0; j < n; j++) {
                b[j][n - 1 - i] = a[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
