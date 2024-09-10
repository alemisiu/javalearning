
Napisz kod metody konwertujEurNaUsd, która będzie zamieniać euro na dolary po podanym kursie wymiany.
Użyj instrukcji return, aby zwrócić wynik z metody konwertujEurNaUsd. Przykład: return 123*435;
W metodzie main wywołaj metodę konwertujEurNaUsd dwa razy, z dowolnymi argumentami.
Wyświetl wyniki, za każdym razem w nowej linii.

Wskazówka:
Do obliczenia wyniku służy następujący wzór: dolary = euro * kurs wymiany

Requirements:
Metoda konwertujEurNaUsd musi mnożyć kwotę euro przez kurs wymiany i zwracać wynik.
Metoda main musi wywoływać metodę konwertujEurNaUsd dwa razy, z dowolnymi argumentami.
Metoda main powinna wyświetlać wynik wywołań, każdy w nowej linii.
Metoda konwertujEurNaUsd nie powinna nic wyświetlać.



package pl.codegym.task.task03.task0303;

/* 
Wymiana walut
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
     System.out.println(konwertujEurNaUsd(5,1.18));
     System.out.println(konwertujEurNaUsd(10,1.18));
        
    }

    public static double konwertujEurNaUsd(int eur, double kursWymiany) {
        //tutaj wpisz swój kod
     double dolary = eur * kursWymiany;
     return dolary;
     
    }
}
