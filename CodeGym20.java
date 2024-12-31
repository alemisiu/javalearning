import java.util.ArrayList;
import java.util.Collections;
import java.io.*;
public class CodeGym20 {
    public static void main(String[] args) throws NumberFormatException, IOException {
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        var items = new ArrayList<>();

        items.add(Integer.parseInt(reader.readLine()));
        items.add(Integer.parseInt(reader.readLine()));
        items.add(Integer.parseInt(reader.readLine()));

           Collections.sort(items, Collections.reverseOrder());

           System.out.println("Posortowana lista malejąco: " + items);
    }

    
}
