apisz metodę setLicznikKotow. Metoda musi ustalać liczbę kotów (licznikKotow).

Requirements:
Klasa Kot musi mieć tylko jedną zmienną licznikKotow.
Zmienna licznikKotow musi być statyczna i typu int, mieć modyfikator dostępu prywatny i być zainicjowana wartością zero.
Klasa Kot musi mieć dwie metody: setLicznikKotow i main.
Metoda setLicznikKotow klasy Kot musi ustawiać wartość zmiennej licznikKotow jako przekazany argument.


package pl.codegym.task.task04.task0405;

/* 
Ustalanie liczby kotów
*/

public class Kot {
    private static int licznikKotow = 0;

    public static void setLicznikKotow(int licznikKotow) {
        //tutaj wpisz swój kod
       Kot.licznikKotow = licznikKotow;
    }

    public static void main(String[] args) {

    }
}
