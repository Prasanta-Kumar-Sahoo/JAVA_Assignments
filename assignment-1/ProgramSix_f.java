public class ProgramSix_f {

    public static void main(String[] args) {
        int n = 1234, m = 4567;
        int num1, num2, n1, m1;

        int sum = 0;
        num1 = n % 10;
        num2 = m % 10;

        n1 = num1 % 2 == 0 ? num1 : 0;
        m1 = num2 % 2 != 0 ? num2 : 0;
        sum = sum + (n1 * m1);
        n = n / 10;
        m = m / 10;

        num1 = n % 10;
        num2 = m % 10;
        n1 = num1 % 2 == 0 ? num1 : 0;
        m1 = num2 % 2 != 0 ? num2 : 0;
        n = n / 10;
        m = m / 10;
        sum = sum + (n1 * m1);

        num1 = n % 10;
        num2 = m % 10;
        n1 = num1 % 2 == 0 ? num1 : 0;
        m1 = num2 % 2 != 0 ? num2 : 0;
        n = n / 10;
        m = m / 10;
        sum = sum + (n1 * m1);

        num1 = n % 10;
        num2 = m % 10;
        n1 = num1 % 2 == 0 ? num1 : 0;
        m1 = num2 % 2 != 0 ? num2 : 0;
        n = n / 10;
        m = m / 10;
        sum = sum + (n1 * m1);

        System.out.println("the sum value is " + sum);
    }
}
