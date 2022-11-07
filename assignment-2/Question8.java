import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s1, s2, s3, s4, total;
        float percntage, sgpa;
        System.out.println("enter total mark in c: ");
        s1 = sc.nextInt();

        System.out.println("enter total mark in c++: ");
        s2 = sc.nextInt();

        System.out.println("enter total mark in java: ");
        s3 = sc.nextInt();

        System.out.println("enter total mark in python: ");
        s4 = sc.nextInt();

        // total mark & percentage ---
        total = s1 + s2 + s3 + s4;
        percntage = (total / 400) * 100;
        System.out.println(percntage);

        // SGPA ---------
        // sgpa = (percntage + 7.5) / 100;

    }
}
