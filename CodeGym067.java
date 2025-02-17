import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CodeGym067 {
    public static void main(String[] args) throws Exception {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] tablica = new int[20];
        int [] tablica1 = new int[10];
        int [] tablica2 = new int[10];

        for(int i =0; i < 20; i++){
            tablica[i] = Integer.parseInt(reader.readLine());
        }
        for( int i =0; i<10; i++){
            tablica1[i] = tablica[i];
            
        }
        for(int i =10 ; i<20;i++){
            tablica2[i-10] = tablica[i];
        }
        for(int i =0; i<10; i++){
            System.out.println(tablica2[i]);
        }
    }
}
