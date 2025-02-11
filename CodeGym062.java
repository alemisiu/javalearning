
package pl.codegym.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Maksimum w tablicy
*/

public class CodeGym062{
    public static void main(String[] args) throws Exception {
        int[] tablica = inicjalizujTablice();

        int max = max(tablica);

        System.out.println(max);
    }

    public static int[] inicjalizujTablice() throws IOException {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        int[] tablica = new int[20];
        for (int i = 0; i < 20; i++) {
            tablica[i] = Integer.parseInt(bis.readLine());
        }
        return tablica;
    }

    public static int max(int[] tablica) {
        int max = tablica[0];
        for (int i = 1; i < 20; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
        return max;
    }
}
