import java.util.Scanner;

public class consective {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        int count=0;
        int t=0;
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
            for(int j=0;j<n;j++){
                if(a[j]==1){
                    count++;
                }else{
                    t=count;
                    count=0;
                }
            }
        if(t>count){
            System.out.println(t);
        }else {
            System.out.println(count);
        }
    }
}
