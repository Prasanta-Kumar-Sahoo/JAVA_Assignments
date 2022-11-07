import java.util.Scanner;

public class Question1k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, num1, temp, diff = 0, sum1 = 0, sum2 = 0;
        System.out.println("enter a number: ");
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
            if (a % 2 == 0 && b % 2 == 0) {
                if ((a != 2 && a != 6) && (b != 2 && b != 6)) {
                    sum1 += a * b;

                }
            } else {
                if ((a != 3 && a != 7) && (b != 3 && b != 7)) {
                    sum2 += a * b;
                }
            }

            num1 /= 10;
        }
        System.out.println(sum1);
        System.out.println(sum2);
        sc.close();
    }
}
