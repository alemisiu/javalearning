import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class CodeGym061 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        
        Arrays.sort(numbers);
        
        for (int number : numbers) {
            System.out.println(number);
        }       
    }
}