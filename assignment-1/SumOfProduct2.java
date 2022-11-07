/*find sum of product of corresponding digits of two any 4 digit 
number Such as n=1234 m=7896 output=6*4+9*3+8*2+7*1   */
class SumOfProduct2 {
    static public void main(String args[]) {
        int num1, num2, n1, n2, n3, n4, n5, n6, n7, n8, sum;
        // for first number
        num1 = 5274;
        n1 = num1 % 10;
        n2 = num1 / 10 % 10;
        n3 = num1 / 100 % 10;
        n4 = num1 / 1000;
        // for second number
        num2 = 7419;
        n5 = num2 % 10;
        n6 = num2 / 10 % 10;
        n7 = num2 / 100 % 10;
        n8 = num2 / 1000;

        sum = n1 * n5 + n2 * n6 + n3 * n7 + n4 * n8;

        System.out.println("the sum of product of corresponding digits : " + sum);
    }

}
