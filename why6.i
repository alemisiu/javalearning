package pl.codegym.task.task04.task0407;

/* 
Koty we Wszechświecie
*/

public class Solution {
    public static void main(String[] args) {
        Kot kot1 = new Kot();
       
         Kot.licznik = Kot.licznik + 1;
       
        Kot kot2 = new Kot();
       
      Kot.licznik++;

        System.out.println("Liczba kotów to " + Kot.licznik);
    }

    public static class Kot {
        public static int licznik = 0;
    }
}



Napisz kod, który policzy i poda dokładną liczbę utworzonych kotów (licznik) i wyświetli poprawną liczbę kotów na ekranie.

Requirements:
Program powinien wyświetlać tekst na ekranie.
Nie zmieniaj linii odpowiedzialnej za wyświetlanie na ekranie.
Klasa Kot musi mieć tylko jedną zmienną licznik.
Zmienna licznik klasy Kot musi być statyczna i typu int, mieć modyfikator dostępu publiczny i być zainicjowana wartością zero.
Metoda main powinna mieć tylko dwie zainicjowane zmienne Kot.
Zmienna licznik musi przechowywać aktualną liczbę utworzonych obiektów kot.