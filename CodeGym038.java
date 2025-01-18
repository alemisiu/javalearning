import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class CodeGym038 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int suma = 0;

        while (true) {
            String s = buffer.readLine();
            if (s.equals("sumuj")) {
                break;
            }
            try {
                int liczba = Integer.parseInt(s);
                suma += liczba;
            } catch (NumberFormatException e) {
                System.out.println("Wprowadź poprawną liczbę albo 'sumuj' by zakończyć.");
            }
        }

        System.out.println("Suma: " + suma);
    }
}