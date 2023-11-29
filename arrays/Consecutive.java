import java.util.Arrays;
import java.util.Scanner;

public class Consecutive {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        Arrays.sort(a);
        int count=0;
        for(int i=0;i<n-1;i++){
           int c=a[i];
            if((c+1)==a[i+1]){
                count++;
            }else{
                count=0;
            }
        }
        System.out.print(count);
    }
}
