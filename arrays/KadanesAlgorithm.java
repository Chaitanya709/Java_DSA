import java.util.Scanner;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int maxnum=0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                count=count+a[j];
                maxnum=Math.max(count,maxnum);
            }
        }
        System.out.println(maxnum);

    }
}
