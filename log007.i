package pl.codegym.task.task03.task0309;

/* 
Suma 5 liczb
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
         int suma =0;
        for(int i =1; i <=5;i++){
            suma = suma + i;
            System.out.println(suma);
            
        }
    }
}
Suma 5 liczb
Wyświetl sumę liczb od 1 do 5, linia po linii (powinno być 5 linii):
1
1+2=3
1+2+3=6
...

Przykładowy wynik:
1
3
6
...

Requirements:
Program powinien wyświetlać tekst.
Wyświetlony tekst powinien składać się z 5 linii.
Liczba w każdej kolejnej linii musi być większa niż w poprzedniej.
Wyświetlany tekst musi spełniać warunki zadania.