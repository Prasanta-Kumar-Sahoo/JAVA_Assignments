class FaceValue {
    public static void main(String args[]) {
        int num = 5467, f1, f2, f3, f4, p1, p2, p3, p4;
        f1 = num % 10;
        p1 = num % 10;
        System.out.println("the first position value: " + f1);
        System.out.println("the first position number: " + p1);

        // for second digit

        f2 = num / 10 % 10;
        p2 = num / 10 % 10 * 10;

        System.out.println("the second position value: " + f2);
        System.out.println("the second position number: " + p2);

        f3 = num / 100 % 10;
        p3 = num / 100 % 10 * 100;
        System.out.println("the third position value: " + f3);
        System.out.println("the third position number: " + p3);

        f4 = num / 1000;
        p4 = num - num % 1000;
        System.out.println("the forth position value: " + f4);
        System.out.println("the forth position number: " + p4);

    }
}
