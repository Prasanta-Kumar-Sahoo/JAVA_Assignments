import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1, num2, num3, fact1 = 1, fact2 = 1, fact3 = 1, i = 1, j = 1;

        // for while loop
        System.out.println("For using while-loop\nenter the number: ");
        num1 = sc.nextInt();

        while (i <= num1) {
            fact1 = fact1 * i;
            i++;
        }
        System.out.println("the factorial using while loop of a given number " + num1 + " is " + fact1);

        // for Do-while loop
        System.out.println("For Do-while loop \n Enter a number :");
        num2 = sc.nextInt();

        do {
            fact2 = fact2 * i;
            j++;
        } while (j <= num2);
        System.out.println("the factorial using Do-while loop of a given number " + num2 + " is " + fact2);

        // using for loop

        System.out.println("Using For-loop \n Enter a number :");
        num3 = sc.nextInt();

        for (i = 1; i <= num3; i++) {
            fact3 = fact3 * i;
        }
        System.out.println("the factorial using For loop of a given number " + num3 + " is " + fact3);

        sc.close();
    }
}
