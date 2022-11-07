
//Write a java program to find sum of product of corresponding digits of two any digit number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, temp1, temp2, sum = 0, n1, n2;

        System.out.println("enter first number: ");
        num1 = sc.nextInt();

        System.out.println("enter second number: ");
        num2 = sc.nextInt();

        n1 = num1;
        n2 = num2;
        while (n1 != 0 && n2 != 0) {
            int a, b;
            temp1 = n1;
            temp2 = n2;
            a = temp1 % 10;
            b = temp2 % 10;
            if (a == 0 && b == 0) {
                break;
            }

            sum += a * b;

            n1 /= 10;
            n2 /= 10;

        }
        System.out.println(
                "sum of product of corresponding digits of two digit number" + num1 + " and " + num2 + " is " + sum);
        sc.close();

    }

}
