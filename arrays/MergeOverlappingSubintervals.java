import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeOverlappingSubintervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int a[][] = new int[row][col];
        List<List<Integer>> listOfLists = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = scanner.nextInt();
            }
        }


        for (int[] i : a) {
            Arrays.sort(i);
        }

        for (int i =0; i <row-1 ; i++) {
            if (a[i][1] >= a[i + 1][0]) {
                // Merge overlapping intervals
                a[i][1] = Math.max(a[i][1], a[i + 1][1]);
              //  System.out.print(a[i][1]);

                for (int[] j : a) {
                    List<Integer> rowList = Arrays.asList(Arrays.stream(j).boxed().toArray(Integer[]::new));
                    listOfLists.add(rowList);
                }

                listOfLists.remove(i + 1);
               // row--; // Adjust the row count after merging
            }
        }

        for (List<Integer> innerList : listOfLists) {
            for (Object element : innerList) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
/*
Arrays.asList(Arrays.stream(row).boxed().toArray(Integer[]::new))
is used to convert each row of the 2D array into a list of integers
 */