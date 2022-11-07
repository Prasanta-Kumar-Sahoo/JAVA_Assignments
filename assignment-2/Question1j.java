// Sum of product of consecutive prime digits of any dig

import java.util.Scanner;

public class Question1j {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num1, temp, sum = 0;
        System.out.println("enter a number:");
        num = sc.nextInt();
        num1 = num;
        while (num1 != 0) {
            int a, b;
            temp = num1;

            a = temp % 10;
            temp /= 10;
            if (a == 0) {
                break;
            }

            b = temp % 10;
            if ((a == 2 || a == 3 || a == 5 || a == 7) && (b == 2 || b == 3 || b == 5 || b == 7)) {
                sum += a * b;
            }
            num1 /= 10;
        }
        System.out.println("Sum of product of consecutive prime digits of number " + num + " is " + sum);
        sc.close();
    }
}
