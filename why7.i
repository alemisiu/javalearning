Code
Napisz metodę wyswietlNajblizszaDziesiatce. Metoda powinna wyświetlać argument, który znajduje się najbliżej 10.
Na przykład z liczb 8 i 11, 11 jest najbliżej 10. Jeśli obie liczby są równie blisko 10, to wyświetli się którakolwiek z nich.

Wskazówka:
użyj metody public static int abs(int a) , która zwróci wartość bezwzględną liczby.

Requirements:
Program powinien wyświetlać tekst na ekranie.
Metoda main nie powinna wywoływać System.out.println ani System.out.print.
Metoda main powinna wywoływać metodę wyswietlNajblizszaDziesiatce.
Metoda wyswietlNajblizszaDziesiatce powinna wywoływać metodę abs.
Metoda wyswietlNajblizszaDziesiatce powinna wyświetlać na ekranie liczbę zgodnie z warunkami zadania.



package pl.codegym.task.task04.task0409;

/* 
Najbliżej 10
*/

public class Solution {
    public static void main(String[] args) {
        wyswietlNajblizszaDziesiatce(8, 11);
        wyswietlNajblizszaDziesiatce(7, 14);
    }

    public static void wyswietlNajblizszaDziesiatce(int a, int b) {
       if(abs(a-10)> abs(b-10))
       {
           System.out.println(b);
       }
       else{
           System.out.println(a);
       }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}