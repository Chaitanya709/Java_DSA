import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a[] = new int[100];
        int n = s.nextInt();
        int flag= 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
                if (a[i] <= a[i+1]) {
                    flag++;
                }
        }if(flag!=n-1){
            System.out.println("array is not sorted");
        }
    }
}
