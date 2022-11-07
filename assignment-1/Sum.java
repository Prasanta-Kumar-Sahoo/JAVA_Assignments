public class Sum {
    public static void main(String args[]) {
        int sum, num = 7327;
        sum = num % 10 + (num / 10) % 10 + (num / 100) % 10 + (num / 1000) % 10;

        System.out.println("the sum of all digits of a number " + num + " is " + sum);

    }
}
