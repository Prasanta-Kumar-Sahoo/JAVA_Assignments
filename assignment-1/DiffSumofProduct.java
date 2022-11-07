import java.util.*;

public class DiffSumofProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nume, numo;
        System.out.println("enter the number");
        nume = sc.nextInt();

        numo = nume;
        int n1, n2, n3, n4, o1, o2, o3, o4, sume = 0, n, sumo = 0;
        int differ;
        n = nume % 10;
        n1 = n % 2 == 0 ? n == 2 ? 0 : n == 6 ? 0 : n : 0;
        nume = nume / 10;
        System.out.println("the n1 value is " + n1);

        n = nume % 10;
        n2 = n % 2 == 0 ? n == 2 ? 0 : n == 6 ? 0 : n : 0;
        nume = nume / 10;
        System.out.println("the n2 value is " + n2);

        n = nume % 10;
        n3 = n % 2 == 0 ? n == 2 ? 0 : n == 6 ? 0 : n : 0;
        nume = nume / 10;
        System.out.println("the n3 value is " + n3);

        n = nume % 10;
        n4 = n % 2 == 0 ? n == 2 ? 0 : n == 6 ? 0 : n : 0;
        nume = nume / 10;
        System.out.println("the n4 value is " + n4);

        sume = (n1 * n2) + (n2 * n3) + (n3 * n4);

        System.out.println("the sum of conjugative even value is " + sume);

        n = numo % 10;
        o1 = n % 2 != 0 ? n == 3 ? 0 : n == 7 ? 0 : n : 0;
        numo = numo / 10;

        System.out.println("the o1 value is " + o1);

        n = numo % 10;
        o2 = n % 2 != 0 ? n == 3 ? 0 : n == 7 ? 0 : n : 0;
        numo = numo / 10;
        System.out.println("the o2 value is " + o2);

        n = numo % 10;
        o3 = n % 2 != 0 ? n == 3 ? 0 : n == 7 ? 0 : n : 0;
        numo = numo / 10;
        System.out.println("the o3 value is " + o3);

        n = numo % 10;
        o4 = n % 2 != 0 ? n == 3 ? 0 : n == 7 ? 0 : n : 0;
        numo = numo / 10;
        System.out.println("the o4 value is " + o4);

        sumo = (o1 * o2) + (o2 * o3) + (o3 * o4);
        System.out.println("the sum of conjugative odd value is " + sumo);

        differ = sume - sumo;
        System.out.println("the difference value is " + differ);
        sc.close();
    }
}
