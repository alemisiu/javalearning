import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CodeGym019 {
    

    public static void main(String[] args) throws Exception {
        //tutaj wpisz swój kod
        BufferedReader  bufferedReader =  new BufferedReader(new InputStreamReader(System.in));
        String liczba = bufferedReader.readLine();
        int l = Integer.parseInt(liczba);
        
        if(l > 0){
            System.out.println(l * 2);
            
        }
        else{
            if( l< 0){
                System.out.println(l + 1);
            }
            else{
                System.out.println(l);
            }
        }

    }

}