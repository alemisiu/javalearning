
/* 
Najmniejsza z trzech liczb
*/

public class Solution {
    public static int min(int a, int b, int c) {
        //tutaj wpisz swój kod
       int min =a;
       if(b < min){
           min =b;
       }
       if(c < min){
           min =c;
       }
       return min;
       
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}

Napisz funkcję, która wybiera najmniejszą z trzech liczb.

Wskazówka:
Musisz napisać ciało istniejącej funkcji min.

Requirements:
Program powinien wyświetlać tekst na ekranie.
Metoda min nie powinna wyświetlać tekstu na ekranie.
Metoda main powinna wywoływać metodę min cztery razy.
Metoda main powinna wyświetlać wynik działania metody min. Za każdym razem w nowej linii.
Metoda min musi zwracać najmniejszą spośród liczb a, b i c.