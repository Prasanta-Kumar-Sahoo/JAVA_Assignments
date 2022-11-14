import java.util.Scanner;

/* Write a program to find average and also find total no. of odd, even, prime and palindrome number available in an array of 30 user defined numbers? */

public class Quesition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num[] = new int[30];
        int sum = 0, CountEven = 0, CountOdd = 0, CountPrime = 0, CountPalindrume = 0;
        for (int i = 0; i < num.length; i++) {
            System.out.println("enter a number : ");
            num[i] = sc.nextInt();
        }

        // ------average and OddEven ------

        for (int i = 0; i < num.length; i++) {
            sum += num[i];
            if (num[i] == 0) {
                CountEven++;
            } else
                CountOdd++;
        }

        // ---Prime----

        for (int i = 0; i < num.length; i++) {
            int count = 0;
            for (int j = 0; j <= num.length; j++) {
                if (num[i] % j == 0) {
                    count++;
                }
                if (count == 2) {
                    CountPrime++;
                }
            }
        }

        // ------pallindrume -----

        for (int i = 0; i < num.length; i++) {
            int temp = num[i], sum1 = 0;

            while (temp > 0) {
                int rem = temp % 10;
                sum1 = sum1 * 10 + rem;
                temp /= 10;
            }
            if (sum1 == num[i]) {
                CountPalindrume++;
            }
        }

        System.out.println("the average of all number is " + sum / num.length);
        System.out.println("the total Even numbers is " + CountEven);
        System.out.println("the total Odd numbers is " + CountOdd);
        System.out.println("the total Prime numbers is " + CountPrime);
        System.out.println("the total Palindrume numbers is " + CountPalindrume);

        sc.close();
    }
}
