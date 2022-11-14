import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, temp, count = 0, sum = 0;
        System.out.println("enter a number: ");
        num = sc.nextInt();
        temp = num;

        for (int i = 1; i <= temp; i++) {
            if (temp % i == 0) {
                count++;
            }
        }

        while (temp > 0) {
            int rem = temp % 10;
            sum *= 10 + rem;
            temp /= 10;
        }
        if (count == 2 && sum == num) {
            System.out.println("the number is prime number and its palindrom");

        } else {
            System.out.println("try again....");
        }
        sc.close();
    }
}
