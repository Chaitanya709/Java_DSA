import java.util.Scanner;

public class sumproblem {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                for(int b=j+1;b<n-1;b++){
                    if(a[i]+a[j]+a[b]==0){
                        System.out.println(a[i]+" "+a[j]+" "+a[b]);
                        //System.out.print(i+" "+j);
                        break;
                    }
                }
            }
        }
    }
}
