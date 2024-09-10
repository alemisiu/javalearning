
Amigo, dziś naszym zadaniem jest wypełnienie basenu na statku. Oblicz, ile litrów wody potrzeba, żeby wypełnić basen po brzegi. Basen ma wymiary a x b x c, podane w metrach.
Te wymiary są przekazywane do metody getObjetosc. Metoda powinna zwrócić liczbę litrów wody potrzebnych do wypełnienia basenu.

Przeanalizuj ten przykład:
Metoda getObjetosc została wywołana z argumentami 25, 5 i 2.

Przykładowy wynik:
250000

Requirements:
Metoda getObjetosc(int, int, int) musi być publiczna i statyczna.
Metoda getObjetosc(int, int, int) musi zwracać typ long.
Metoda getObjetosc(int, int, int) nie powinna nic wyświetlać.
Metoda getObjetosc(int, int, int) musi zwracać prawidłową ilość wody w litrach potrzebną do wypełnienia basenu.


package pl.codegym.task.task01.task0134;

/* 
Napełnij basen wodą
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjetosc(25, 5, 2));
    }

    public static long getObjetosc(int a, int b, int c) {
        //tutaj wpisz swój kod
        int v = a * b * c * 1000;
        
        
        
        return v;
        
        
        
    }
}