import java.util.Scanner;

public class remove {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        //int flag=0;
        int counter=0;
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++) {
            a[i] = s.nextInt();
        }
        for(int i=0;i<n;i++){
            int flag=0;
            for(int j=0;j<=i;j++) {
                if (a[i] == b[j]) {
                    flag = 1;
                    break;
                }
                counter=j;
            }
            if(flag==0)
            {
                b[counter]=a[i];
            }
        }

        for (int i:b)
        {
            System.out.println(i);
        }
    }
}
