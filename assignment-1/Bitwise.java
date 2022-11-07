class Bitwise {
    public static void main(String args[]) {
        boolean a, b, c, carry, sum;
        a = true;
        b = false;
        c = false;
        sum = a ^ b;
        carry = a & b;
        System.out.println("value of a is: " + a);
        System.out.println("value of b is: " + b);
        System.out.println("value of c is: " + c);
        System.out.println("value of Sum is: " + sum);
        System.out.println("value of carry is: " + carry);
    }
}
