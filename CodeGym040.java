import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CodeGym040 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int suma = a + b;
        System.out.println("Suma = " + suma);
    }
}

    
