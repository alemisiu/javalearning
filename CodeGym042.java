import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CodeGym042 {



    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(reader.readLine());
        if (N <= 0) {
            return; // Nie wyświetlaj nic, jeśli N jest mniejsze lub równe 0
        }

        int maksimum = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int liczba = Integer.parseInt(reader.readLine());
            if (liczba > maksimum) {
                maksimum = liczba;
            }
        }

        System.out.println(maksimum);
    }
}
    

