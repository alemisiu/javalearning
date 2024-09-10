package pl.codegym.task.task02.task0217;

public class Solution {
    // Metoda zwracająca najmniejszą liczbę z czterech, używając metody min(int a, int b)
    public static int min(int a, int b, int c, int d) {
        // Używamy metody min(a, b) dla wszystkich wartości
        return min(min(a, b), min(c, d));
    }

    // Metoda zwracająca najmniejszą liczbę z dwóch
    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));               // Oczekiwany wynik: -20
        System.out.println(min(-20, -10, -30, -40));     // Oczekiwany wynik: -40
        System.out.println(min(-20, -10, -30, 40));      // Oczekiwany wynik: -30
        System.out.println(min(-40, -10, -30, 40));      // Oczekiwany wynik: -40
    }
}
Napisz funkcję, która wybiera najmniejszą z czterech liczb.
Funkcja min(a, b, c, d) powinna używać (wywoływać) funkcji min(a, b)

Wskazówka:
Musisz napisać ciało dwóch istniejących funkcji min.

Requirements:
•	Program powinien wyświetlać tekst na ekranie.
•	Metody min nie powinny wyświetlać tekstu na ekranie.
•	Metoda main powinna wywoływać min(a, b) i min(a, b, c, d).
•	Metoda main powinna wyświetlać wynik działania metod min. Za każdym razem w nowej linii.
•	Metoda min(a, b) musi zwracać mniejszą z liczb a i b.
•	Metoda min(a, b, c, d) musi używać metody min(a, b).
•	Metoda min(a, b, c, d) musi zwracać najmniejszą z liczb a, b, c i d.