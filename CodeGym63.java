
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CodeGym63 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        

        String [] tablica = new String[10];

        for(int i =0; i<8; i++){
            tablica[i] = reader.readLine();
    }
    for(int i = 9; i>= 0; i--){
        System.out.println(tablica[i]);
    }
}
}


