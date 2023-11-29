import java.util.Scanner;

public class Fibinoccic {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=0,b=1,a=0;
        System.out.print(0+" "+1);
        for(int i=2;i<n;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
