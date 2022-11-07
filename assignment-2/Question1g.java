
/**
 * Question1_vii
 */
import java.util.Scanner;

public class Question1g {
    public static void main(String[] args) {
        int num, num1, temp, a, b, sum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        num = sc.nextInt();
        num1 = num;
        while (num1 != 0) {
            temp = num1;
            a = temp % 10;
            temp /= 10;
            b = temp % 10;

            if (temp == 0) {
                break;
            }
            sum += a * b;
            num1 /= 10;
        }
        System.out.println("Sum of product of consecutive digits of a number " + num + " is " + sum);
        sc.close();
    }

}