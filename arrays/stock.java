import java.util.Scanner;
public class stock {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int m=0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            int num=0;
            for(int j=i;j<n;j++){
                num=a[j]-a[i];
                if(num>a[i]){
                     m=Math.max(num,m);
                }
            }
        }
        System.out.print(m);
    }
}
