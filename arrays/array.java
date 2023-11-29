import java.util.Scanner;

public class array {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] < a[j]) {
                    count = a[i];
                    a[i] = a[j];
                    a[j] = count;
                }
            }
        }
        /*for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(a[i]<a[j]){
                    a[i]=a[j];
                    break;
                }
                else{
                    a[i]=-1;
                }
            }
        }*/
        for(int i:a){
            System.out.print(i+" ");
        }

    }
}
