import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Kot {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Odczytanie imion kotów
        String dziadekName = reader.readLine();
        String babciaName = reader.readLine();
        String ojciecName = reader.readLine();
        String matkaName = reader.readLine();
        String synName = reader.readLine();
        String corkaName = reader.readLine();

        // Tworzenie obiektów kotów
        Kot dziadek = new Kot(dziadekName, null, null);
        Kot babcia = new Kot(babciaName, null, null);
        Kot ojciec = new Kot(ojciecName, null, dziadek);
        Kot matka = new Kot(matkaName, babcia, null);
        Kot syn = new Kot(synName, matka, ojciec);
        Kot corka = new Kot(corkaName, matka, ojciec);

        // Wyświetlanie informacji o kotach
        System.out.println(dziadek);
        System.out.println(babcia);
        System.out.println(ojciec);
        System.out.println(matka);
        System.out.println(syn);
        System.out.println(corka);
    }

    private String imie;
    private Kot matka;
    private Kot ojciec;

    Kot(String imie, Kot matka, Kot ojciec) {
        this.imie = imie;
        this.matka = matka;
        this.ojciec = ojciec;
    }

    @Override
    public String toString() {
        String matkaName = (matka != null) ? matka.imie : "brak matki";
        String ojciecName = (ojciec != null) ? ojciec.imie : "brak ojca";
        return "Imię kota to " + imie + ", " + matkaName + " to matka, " + ojciecName + " to ojciec";
    }
}
//Zadanie: każdy kot ma imię i matkę.
// Utwórz klasę, która opisuje tę sytuację.
// Utwórz dwa obiekty: corka kot i matka.
// Wyświetl je na ekranie.

// Nowe zadanie: Każdy kot ma imię, ojca i matkę.
// Edytuj klasę Kot tak, by odzwierciedlała te relacje.
// Utwórz 6 obiektów: dziadek (ojciec ojca), babcia (matka matki), ojciec, matka, syn, corka.
// Wyświetl je wszystkie w następującej kolejności: dziadek, babcia, ojciec, matka, syn, corka.

// Przykładowe wejście:
// Dziadek Tytus
// Babcia Pestka
// Ojciec Oskar
// Matka Mania
// Syn Simba
// Corka Koko

// Przykładowy wynik:
// Imię kota to Dziadek Tytus, brak matki, brak ojca
// Imię kota to Babcia Pestka, brak matki, brak ojca
// Imię kota to Ojciec Oskar, brak matki, Dziadek Tytus to ojciec
// Imię kota to Matka Mania, Babcia Pestka to matka, brak ojca
// Imię kota to Syn Simba, Matka Mania to matka, Ojciec Oskar to ojciec
// Imię kota to Corka Koko, Matka Mania to matka, Ojciec Oskar to ojciec

// Requirements:
// Program powinien czytać imiona 6 kotów w określonej kolejności.
// Metoda main powinna tworzyć 6 obiektów Kot.
// Program powinien wyświetlać 6 linii z informacjami o kotach.
// Linia dotycząca dziadka (pierwsza linia) musi spełniać warunki.
// Linia dotycząca babci (druga linia) musi spełniać warunki.
// Linia dotycząca ojca (trzecia linia) musi spełniać warunki.
// Linia dotycząca matki (czwarta linia) musi spełniać warunki.
// // Linia dotycząca syna (piąta linia) musi spełniać warunki.