public class temp {
    public static void main(String args[]) {
        double temp_f, temp_k;
        double temp_c = 34.54;
        temp_f = temp_c * (9 / 5) + 32;
        temp_k = (temp_f - 32) * (5 / 9) + 273.15;
        System.out.println("celcius :- " + temp_c + "\nFahrenheit :- " + temp_f + "\nKelvin :-" + temp_k);

    }

}
