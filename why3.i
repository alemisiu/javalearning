
Napisz kod w metodzie dodajNowegoKota, aby zwiększyć liczbę kotów o 1 za każdym razem, gdy metoda ta jest wywoływana.
Zmienna licznikKotow odpowiada liczbie kotów.

Requirements:
Klasa Kot musi mieć tylko jedną zmienną licznikKotow.
Zmienna licznikKotow musi być statyczna i typu int, mieć modyfikator dostępu prywatny i być zainicjowana wartością zero.
Klasa Kot musi mieć dwie metody: dodajNowegoKota i main.
Metoda dodajNowegoKota musi zwiększać liczbę kotów o 1.


package pl.codegym.task.task04.task0404;

/* 
Rejestr kota
*/

public class Kot {
    private static int licznikKotow = 0;

    public static void dodajNowegoKota() {
        //tutaj wpisz swój kod
        licznikKotow++;
    }

    public static void main(String[] args) {

    }
}
