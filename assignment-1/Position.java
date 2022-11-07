/*  Find the value available at position required by user it may be 10, 
100 or 1000? */

class Position {
    public static void main(String args[]) {
        int num = 4576;
        System.out.println("the Value available at position 1 : " + num % 10);
        System.out.println("the Value available at position 10 : " + num / 10 % 10);
        System.out.println("the Value available at position 100 : " + num / 100 % 10);
        System.out.println("the Value available at position 100 : " + num / 1000);
    }
}
