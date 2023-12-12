import java.util.Scanner;
public class MaximumProductSubarray {
    public static void max(int a[]){
        int count=0;
        int maxProduct = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            count=a[i];
            for(int j=i+1;j<a.length;j++){
                count *=a[j];
                maxProduct=Math.max(maxProduct,count);
            }
        }
        System.out.println(maxProduct);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        max(a);
    }
}
