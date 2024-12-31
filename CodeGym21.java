import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CodeGym21 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        if( name1 == name2){
            System.out.println("Imiona są identyczne");
           if(name1 == name2 && name1.length() == name2.length()){
               System.out.println("Imiona są takiej samej długości");
           }
            }
            
        }
        
        
        
    }

