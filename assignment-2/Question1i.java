import java.util.Scanner;

public class Question1i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, temp, num1, sum = 0;
        System.out.println("enter a number: ");
        num = sc.nextInt();

        num1 = num;
        while (num1 != 0) {
            int a, b;
            temp = num1;
            a = temp % 10;
            temp /= 10;
            if (temp == 0) {
                break;
            }
            b = temp % 10;
            if (a % 2 != 0 && b % 2 != 0) {
                sum += a * b;
            }
            num1 /= 10;
        }
        System.out.println("Sum of product of consecutive odd digits of number " + num + " is " + sum);
        sc.close();
    }
}
