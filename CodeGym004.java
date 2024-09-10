public class CodeGym004 {
    public static void main(String[] args) {
        printObwodKola(5);
    }

    public static void printObwodKola(int promien) {
        //tutaj wpisz swój kod
        double pi = 3.14;
        System.out.println(2* pi * promien );
    }
}
/*
Wyświetl obwód koła, który jest obliczany za pomocą wzoru: C = 2 * pi * promien.
Wynik to liczba ułamkowa (double).
Użyj 3.14 jako wartości pi.

Requirements:
W metodzie printObwodKola należy wyświetlić obwód koła, obliczany za pomocą wzoru: 2 * pi * promien.
Metoda main powinna wywoływać metodę printObwodKola z liczbą 5 jako argumentem.
Metoda main nie powinna wywoływać metody wyświetlania na ekranie.
Program powinien wyświetlać obwód koła o promieniu 5.


Date data = new Date();
Tworzy obiekt Date. Jest on inicjalizowany bieżącą datą i godziną.
boolean jestPrawda = true;
Inicjalizuje zmienną boolean wartością true
boolean jestMniejsze = (5 > 6);
Przypisuje wartość false do zmiennej jestMniejsze. Zmienne Boolean akceptują tylko wartości true i false.
?
obiekt jest zmienna?
Zmienne referencyjne to wszystkie zmienne, które nie są zmiennymi prostymi. Takie zmienne przechowują tylko referencję obiektu (odwołanie do obiektu).
– Referencja daje jeszcze jedną korzyść: możesz przekazać referencję obiektu do dowolnej metody i będzie ona mogła użyć tej referencji, aby zmodyfikować (zmienić) obiekt poprzez wywołanie jego metod i dostęp do danych wewnątrz obiektu.
*/
