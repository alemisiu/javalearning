
Zaimplementuj metodę o nazwie print3. Metoda powinna wyświetlać przekazany ciąg (wyraz) trzy razy, ale w tej samej linii.
Wyrazy muszą być oddzielone spacją i nie powinny się łączyć.

Requirements:
Program powinien wyświetlać tekst na ekranie.
Metoda main nie powinna wywoływać System.out.println ani System.out.print.
Metoda print3 powinna wyświetlać tekst na ekranie.
Metoda main powinna wywoływać metodę print3 tylko dwa razy.
Metoda print3 powinna wyświetlać przekazany ciąg (wyraz) trzy razy, ale w tej samej linii.


package pl.codegym.task.task02.task0219;

/* 
Wyświetl trzy razy
*/

public class Solution {
    public static void print3(String s) {
      System.out.print(s + " ");
          System.out.print(s + " ");
              System.out.print(s+ " ");

    }

    public static void main(String[] args) {
        print3("okno");
        print3("plik");
    }
}
