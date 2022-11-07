/* 1. Write a java program to find following using looping and decision making without function
I. Sum of all digits of any numbers  */

import java.util.*;

public class Question1a {
    public static void main(String[] args) {
        int a, b, c, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        a = sc.nextInt();

        b = a;

        while (b != 0) {
            c = b % 10;
            sum = sum + c;
            b = b / 10;
        }

        System.out.println("the sum of digits of a number " + a + " is " + sum);
        sc.close();

    }
}
