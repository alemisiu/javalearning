import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CodeGym065 {
    public static void main(String[] args) {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tablica = new int[10];

        for(int i = 0; i < 10; i++){
            try {
                tablica[i] = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        for (int j = 9; j >= 0; j--) {
            System.out.println(tablica[j]);
    }
    
}
}

