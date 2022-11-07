public class ConsecutiveProduct {
     public static void main(String[] args) {
        int num, sum;
        int n1, n2, n3, n4;

        num = 1624;
        sum = 0;

        n1 = num / 1000;
        n2 = num / 100 % 10;
        n3 = num / 10 % 10;
        n4 = num % 10;

        sum += n1 % 2 == 0 && n2 % 2 == 0  ? n1 * n2 : 0;
        sum += n2 % 2 == 0 && n3 % 2 == 0  ? n2 * n3 : 0;
        sum += n3 % 2 == 0 && n4 % 2 == 0  ? n3 * n4 : 0;
        
        System.out.println("Sum of product of consecutive even digits: "+sum);

    }
    
}
