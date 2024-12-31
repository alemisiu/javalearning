import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CodeGym22 {
    public static void main(String[] args) throws Exception{
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if(a == b && a == c && b == c){
          }  else{
            if (a == b && a != c) {
              System.out.println(3); // Liczba "c" różni się
          } else if (a == c && a != b) {
              System.out.println(2); // Liczba "b" różni się
          } else if (b == c && b != a) {
              System.out.println(1); // Liczba "a" różni się
          }
    }
  }
}



