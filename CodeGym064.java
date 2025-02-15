import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Samotne tablice oddziałują na siebie
*/

public class CodeGym064 {

    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int[] ints = new int[10];
        String[] strings = new String[10];

        for (int i = 0; i < 10; i++) {
            strings[i] = bis.readLine();
            ints[i] = strings[i].length();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(ints[i]);
        }
    }
}
