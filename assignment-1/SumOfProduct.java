/*Sum of product of consecutive digits of any 4 digit number? Supoose
num=1234 then output= 4*3+3*2+2*1
 */

class SumOfProduct {
    public static void main(String args[]) {
        int num, sum, n1, n2, n3, n4;
        num = 3456;
        n1 = num % 10;
        n2 = num / 10 % 10;
        n3 = num / 100 % 10;
        n4 = num / 1000;
        sum = n1 * n2 + n2 * n3 + n3 * n4;

        System.out.println("the sum of product of digits " + sum);
    }

}
