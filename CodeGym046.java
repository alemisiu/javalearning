import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

    public class CodeGym046 {

    public static int parzyste;
    public static int nieparzyste;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(reader.readLine());
        String liczbaStr = String.valueOf(count);

        for(int i = 0; i < liczbaStr.length(); i++){
            int cyfra = Character.getNumericValue(liczbaStr.charAt(i));
            if(cyfra % 2 == 0){
                parzyste++;
            } else {
                nieparzyste++;
            }
                
    }
        }
    }


    

