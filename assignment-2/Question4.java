import java.util.Scanner;
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, n, fact = 1;
        double sum = 1;
        System.out.println("enter a number : ");
        x = sc.nextInt();

        System.out.println("enter the power value : ");
        n = sc.nextInt();

        for (int i = n; i > 1; i--) {
            for (int j = 0; j <= i; j++) {
                fact *= j;
            }
            if (i % 2 == 0) {
                sum -= (Math.pow(x, i) / fact);
                fact = 1;
            } else if (i % 2 != 0) {
                sum += (Math.pow(x, i) / fact);
                fact = 1;
            }
            System.out.println("sum =" + sum);
        }

    }
}
