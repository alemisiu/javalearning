import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodeGym047 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
        double waga = Double.parseDouble(bis.readLine());
        double wzrost = Double.parseDouble(bis.readLine());

        Cialo.obliczBMI(waga, wzrost);
    }

    public static class Cialo {
        public static void obliczBMI(double waga, double wzrost) {
            // tutaj wpisz swój kod
             double bmi = waga / (wzrost * wzrost);
             
             if( bmi <18.5){
                 System.out.println("Niedowaga: BMI < 18.5");
                 
             }else if(bmi< 25){
                 System.out.println("Norma: 18.5 <= BMI < 25");
             }else if(bmi < 30){
                 System.out.println("Nadwaga: 25 <= BMI < 30");
             }else if(bmi >=30){
                 System.out.println("Otyłość: BMI >= 30");
             }
        }
    }
}