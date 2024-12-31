package pl.codegym.task.task04.task0406;

/* 
Rejestr imion
*/

public class Kot {
    private String imieInazwisko;

    public void setImie(String imie, String nazwisko) {
        String imieInazwisko = imie + " " + nazwisko;

        //tutaj wpisz swój kod
        this.imieInazwisko = imie + " " + nazwisko;
        
    }

    public static void main(String[] args) {

    }
}

Rejestr imion
Napisz kod metody setImie, tak aby ustalała wartość private String imieInazwisko jako wartość zmiennej lokalnej String imieInazwisko.

Requirements:
W klasie Kot może być tylko jedna zmienna o nazwie imieInazwisko.
Zmienna imieInazwisko musi być typu String i mieć modyfikator dostępu prywatny.
Klasa Kot musi mieć tylko dwie metody: setImie i main.
Metoda setImie musi mieć zmienną lokalną imieInazwisko.
Metoda setImie klasy Kot musi ustawiać wartość globalnej zmiennej prywatnej String jako zmienną lokalną imieInazwisko.