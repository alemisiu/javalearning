

/* 
Konwersja czasu
*/

public class CodeGym007 {
    public static int konwertujNaSekundy(int godzina){
        int sekunda = 3600 * godzina;
        return sekunda;
    }
    //tutaj wpisz swój kod

    public static void main(String[] args) {
        //tutaj wpisz swój kod
        System.out.println(konwertujNaSekundy(4));
        System.out.println(konwertujNaSekundy(7));
    }
}
