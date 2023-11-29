import java.util.Scanner;

public class pattern {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=1;i<=n;i++){
            int c=i;
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c=c+(n-j);
            }
            System.out.println();
        }
    }
}
