import java.util.Scanner;

public class move {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int temp = 0;
        int count=0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] < a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(a[i]==0){
                count++;
            }
        }
        int b[]=new int[n];
        int j=0;
        for(int i=count;i<n;i++){
            if(a[i]!=0)
            {
                b[j++] = a[i];
            }
        }
        for (int i:b) {
            System.out.print(i+" ");
        }
    }
}
