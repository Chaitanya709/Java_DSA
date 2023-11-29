import java.util.Scanner;

public class Rearrange {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n-1;j++){
                int c=0;
                if(a[i+1]>=0){
                    if(a[j]<0){
                        c=a[i+1];
                        a[i+1]=a[j];
                        a[j]=c;
                    }
                }
            }
        }
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
