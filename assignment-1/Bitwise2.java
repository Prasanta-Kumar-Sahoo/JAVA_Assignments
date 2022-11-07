/*find bitwise and , or , and xor of 2nd and 4th digit of any 4 digit 
number? */

class Bitwise2 {
    public static void main(String args[]) {
        int num = 2573, second_num, forth_num, OrOPerator, AndOperator, XorOperator;

        second_num = num / 10 % 10;
        forth_num = num / 1000;
        OrOPerator = second_num | forth_num;
        AndOperator = second_num & forth_num;
        XorOperator = second_num ^ forth_num;

        System.out.println("The result of 'OR'-operator: " + OrOPerator);
        System.out.println("The result of 'AND'-operator: " + AndOperator);
        System.out.println("The result of 'XOR'-operator: " + XorOperator);

    }
}
