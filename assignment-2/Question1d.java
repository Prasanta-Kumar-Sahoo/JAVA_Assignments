import java.util.*;

public class Question1d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, b, c, sum = 0;
        System.out.println("enter a number: ");
        num = sc.nextInt();

        b = num;
        while (b != 0) {
            c = b % 10;
            if (c == 2 || c == 3 || c == 5 || c == 7) {
                sum = sum + c;
            }
            b = b / 10;
        }
        System.out.println("the sum of all prime digits in the given number " + num + " is " + sum);
        sc.close();
    }
}
