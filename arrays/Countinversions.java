import java.util.Scanner;

public class Countinversions {
    public static void Inversion(int a[]){
        int count=0;
        for(int i=0;i< a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
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
        Inversion(a);
    }
}
