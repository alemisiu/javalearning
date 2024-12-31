Napisz metodę porownaj(int a), tak aby:
- wyświetlała "Liczba jest mniejsza niż 5", jeśli argument metody jest mniejszy niż 5,
- wyświetlała "Liczba jest większa niż 5", jeśli argument metody jest większy niż 5,
- wyświetlała "Liczba jest równa 5", jeśli argument metody jest równy 5.

Requirements:
Program powinien wyświetlać tekst na ekranie.
Metoda main nie powinna wywoływać System.out.println ani System.out.print.
Metoda main powinna wywoływać metodę porownaj.
Metoda poownaj musi być void.
Metoda porownaj powinna wyświetlać tekst na ekranie zgodnie z warunkami zadania.


package pl.codegym.task.task04.task0408;

/* 
Dobry czy zły?
*/

public class Solution {
     public static void main(String[] args) {
        porownaj(3);
        porownaj(6);
        porownaj(5);
    }

    public static void porownaj(int a) {
        //tutaj wpisz swój kod
        if(a <5 ){
            System.out.println("Liczba jest mniejsza niż 5");
        }
        else {
            if(a > 5){
                System.out.println("Liczba jest większa niż 5 ");
                
            }
            else {
              if(a == 5){
              System.out.println("Liczba jest równa 5");
            }
        
        }
    }
    }
        }
