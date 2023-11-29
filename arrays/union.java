import java.util.Scanner;

public class union {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int c[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            b[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]==b[i]){
                c[i]=a[i];
            }
            else{
                c[i]=b[i];
            }
        }
        for(int i=0;i<n;i++) {
            if (a[i] != c[i]) {
                c[i] = a[i];
            }
        }
        for(int i:c){
            System.out.print(i+" ");
        }
    }
}
