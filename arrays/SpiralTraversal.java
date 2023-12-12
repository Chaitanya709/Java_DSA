import java.util.ArrayList;
import java.util.Scanner;

public class SpiralTraversal {
    public ArrayList<Integer> spiral(int r, int c, int a[][]) {
        ArrayList<Integer> list = new ArrayList<>();

        int top = 0, bottom = r - 1, right = c - 1, left = 0;

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                list.add(a[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                list.add(a[i][right]);
            }
            right--;

            // Traverse from right to left
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(a[bottom][i]);
                }
                bottom--;
            }

            // Traverse from bottom to top
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(a[i][left]);
                }
                left++;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n= s.nextInt();
        int m = s.nextInt();
        int a[][] = new int[n][m];

        for (int i = 0; i <=n-1; i++) {
            for (int j = 0; j <=m-1; j++) {
                a[i][j] = s.nextInt();
            }
        }

        SpiralTraversal b = new SpiralTraversal();
        ArrayList<Integer> result = b.spiral(n, m, a);

        // Print the result
        System.out.println(result);
    }
}
