import java.util.Scanner;

public class sign {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]<0){
                int m=0;
                b[m]=a[i];
                m=m++;
            }else{
                c[i]=a[i];
            }
        }
        for(int i:b){
            System.out.println(i);
        }
    }
}
