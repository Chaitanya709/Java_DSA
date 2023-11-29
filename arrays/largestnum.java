import java.util.Scanner;

public class largestnum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a[]=new int[100];
        int n=s.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] < a[j]) {
                    count = a[j];
                    a[j] = a[i];
                    a[i] = count;
                }
            }

        }
            System.out.print(a[n-1]);
    }
}
