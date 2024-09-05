public class CodeGym003 {
   
        /*
Zaimplementuj metodę print. Metoda powinna wyświetlać przekazany ciąg 4 razy. Za każdym razem w nowej linii.

Requirements:
Program powinien wyświetlać tekst na ekranie.
Metoda main nie powinna wywoływać System.out.println ani System.out.print.
Metoda print powinna wyświetlać tekst na ekranie.
Metoda main powinna wywoływać metodę print klasy Solution dokładnie trzy razy.
Metoda print powinna wyświetlić ciąg 4 razy. Za każdym razem w nowej linii. */

 
public static void main(String[] args) {
    print("Javy łatwo się nauczyć!");
    print("Java jest zorientowana obiektowo!");
    print("Java jest niezależna od platformy!");
}

public static void print(String s) {
    
  
    System.out.println(s);
    System.out.println(s);
    System.out.println(s);
    System.out.println(s);
}
}
