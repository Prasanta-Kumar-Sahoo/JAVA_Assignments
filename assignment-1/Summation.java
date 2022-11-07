/* Find left shit, right shift and zero fill of summation of all digits of any 
4 digit number and it will be shifted by 3rd digit of any 4 digit 
number? */
class Summation {
    public static void main(String argv[]) {
        int num = 1234, n1, n2, n3, n4, sum;
        n1 = num / 1000;
        n2 = num / 100 % 10;
        n3 = num / 10 % 10;
        n4 = num % 10;

        sum = n1 + n2 + n3 + n4;

        System.out.println("Number : " + num);
        System.out.println("The Sum of digits is : " + sum);
        System.out.println("The Left Shift Upto " + n3 + " to sum is : " + (sum << n3));
        System.out.println("The Rigft Shift Upto " + n3 + " to sum is : " + (sum >> n3));
        System.out.println("Right shift and Zero fill upto " + n3 + "to sum is " + (sum >>> n3));

    }
}
