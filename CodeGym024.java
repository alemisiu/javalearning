import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CodeGym024 {
public static void main(String[] args) throws Exception{
    
    BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(bis.readLine());

    if (a < 10 && a >= 1) {
        if (a % 2 == 0) {
            System.out.println("parzysta liczba jednocyfrowa");
        } else {
            System.out.println("nieparzysta liczba jednocyfrowa");
        }
    } else if (a < 100 && a >= 10) {
        if (a % 2 == 0) {
            System.out.println("parzysta liczba dwucyfrowa");
        } else {
            System.out.println("nieparzysta liczba dwucyfrowa");
        }
    } else if (a <= 999 && a >= 100) {
        if (a % 2 == 0) {
            System.out.println("parzysta liczba trzycyfrowa");
        } else {
            System.out.println("nieparzysta liczba trzycyfrowa");
        }
    }
}
}
