import java.util.Scanner;
public class CountSubarraysum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int count = 0;
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i ; j < n; j++) {
                 int sum=0;
                for(int m=i;m<=j;m++){
                    sum=sum+a[m];
                }
                if (sum== k) {
                    count++;
                }
            }
        }

        System.out.print(count);
    }
}

