import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MergetwoSortedArrays {
    public static void Merge(int a[],int b[]){
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<a.length;i++){
            list.add(a[i]);
        }

        for(int i=0;i<b.length;i++){
            list.add(b[i]);
        }

        Collections.sort(list);

        for(int i=0;i<a.length;i++){
            a[i] = list.get(i);
        }

        // Remove elements up to the specified index
        int indexToRemoveUpTo= a.length;
        list.subList(0, indexToRemoveUpTo).clear();

        for(int i=0;i<b.length;i++){
            b[i] = list.get(i);
        }

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]);
        }

        System.out.println();

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }
    }
    public static void main(String[] args){
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int m= s.nextInt();
        int a[] =new int[n];
        int b[] =new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }

        Merge(a,b);
    }
}
