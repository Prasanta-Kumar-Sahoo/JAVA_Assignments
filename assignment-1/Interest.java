public class Interest {
    public static void main(String args[]) {
        int principal = 12000;
        int time = 2;
        int rate = 5;
        int simple_interest = (principal * time * rate) / 100;
        System.out.println("principal :- " + principal + "\nTime :- " + time + "\nRate :- " + rate
                + "\nSimple Interest :-" + simple_interest);
    }
}
