/* Sum of all Odd digits of any 4 digit number */
class SumofOdd {
    public static void main(String argv[]) {
        int num = 1234, n1, n2, n3, n4, sum = 0;
        n1 = num / 1000;
        // sum = sum + n1 % 2 == 0 ? n1 : 0;
        sum += n1 % 2 != 0 ? n1 : 0;

        n2 = num / 100 % 10;
        sum += n2 % 2 != 0 ? n2 : 0;

        n3 = num / 10 % 10;
        sum += n3 % 2 != 0 ? n3 : 0;

        n4 = num % 10;
        sum += n4 % 2 != 0 ? n4 : 0;

        System.out.println("the sum of all ODD digits : " + sum);
    }
}
