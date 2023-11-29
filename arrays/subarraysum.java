import java.util.Scanner;
import java.lang.Math;

public class subarraysum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++){
                count=a[j]^count;
                if(count==k){
                   count++;
                }
            }
            System.out.print(count);
        }


    }
}
