import java.util.Scanner;

public class Question1f {
    public static void main(String[] args) {
        int b, c = 1, value;
        long num;
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number: ");
        num = sc.nextLong();

        System.out.println("enter the positon of the number: ");
        b = sc.nextInt();

        for (int i = 1; i < b; i++) {
            c *= 10;
        }
        value = c;

        System.out.println("the position value of given number" + num + " is " + value);
        sc.close();

    }
}
