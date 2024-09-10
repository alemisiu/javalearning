Napisz kod metody dodajDziesiecProcent, który zwiększa przekazaną liczbę całkowitą o 10%.
Użyj instrukcji return, aby zwrócić wynik z metody dodajDziesiecProcent.

Przeanalizuj ten przykład:
return 123 * 435;

Requirements:
Metoda dodajDziesiecProcent powinna zwiększać o 10% wartość przekazanej liczby.
Metoda main powinna wywoływać metodę dodajDziesiecProcent.
Metoda main powinna wyświetlać wyniki wywołania.
package pl.codegym.task.task03.task0304;

/* 
Zadanie z procentami
*/

public class Solution {
    public static double dodajDziesiecProcent(int i) {
        //tutaj wpisz swój kod
     double procent = i + (i*0.1);
     return procent;
    }

    public static void main(String[] args) {
        System.out.println(dodajDziesiecProcent(9));
    }
}
