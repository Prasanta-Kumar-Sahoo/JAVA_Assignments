import java.util.*;

public class Question1c {
    public static void main(String[] args) {

        int num, b, c, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        num = sc.nextInt();

        b = num;
        while (b != 0) {
            c = b % 10;
            if (c % 2 != 0) {
                sum = sum + c;
            }
            b = b / 10;
        }
        System.out.println("the sum of all odd digits in the given number: " + num + " is " + sum);
        sc.close();
    }
}
