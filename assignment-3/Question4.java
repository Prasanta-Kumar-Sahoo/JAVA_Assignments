import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        int num[], temp;
        num = new int[10];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) {
            System.out.println("enter a number : ");
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] > num[j]) {
                    temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.println("the numbers in descending order is : \n");
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
        System.out.println("the average of 3rd largest and 4th smallest number is " + (num[2] * num[6]) / 2);
    }
}
