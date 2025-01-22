import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeGym039 {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Wprowadź pierwszą liczbę: ");
        int liczba1 = Integer.parseInt(buffer.readLine());

        System.out.print("Wprowadź drugą liczbę: ");
        int liczba2 = Integer.parseInt(buffer.readLine());

        int suma = liczba1 + liczba2;

        System.out.println("Suma = " + suma);
    }
}