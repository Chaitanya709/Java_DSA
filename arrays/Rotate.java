import java.util.Scanner;

public class Rotate {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int temp=0;
        for(int i=0;i<r;i++) {
             temp= a[i];
            for(int j=0;j<(n-r);j++){
                a[j]=a[j+r];
            }
            a[n-1]=temp;
        }
        for (int i:a) {
            System.out.print(i+" ");
        }

    }
}
