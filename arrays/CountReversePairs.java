import java.util.Scanner;

/*Reverse Pairs are those pairs where i<j and arr[i]>2*arr[j].*/
public class CountReversePairs {
    public static void reverse(int a[]){
        int count=0;
        for(int i=0;i< a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>2*(a[j])){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[] =new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=s.nextInt();
        }
        reverse(a);

    }
}
