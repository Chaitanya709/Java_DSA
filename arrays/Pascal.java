import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int power=1;
        int p=11;
        int n = s.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <i; j++) {
                power=power*p;
                System.out.print(power);
            }
            System.out.println(" ");
        }
    }
}

