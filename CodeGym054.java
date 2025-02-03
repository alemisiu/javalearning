class CodeGym054 {
    public static void main(String[] args) {
        // Utworzenie 10 obiektów klasy Kot
        for (int i = 0; i < 10; i++) {
            new Kot();
        }

        // Wyświetlenie wartości zmiennej licznikKotow
        System.out.println("Licznik kotów: " + Kot.licznikKotow);

        // Resetowanie licznika kotów
        Kot.resetLicznikKotow();
    }
}

class Kot {
    public static int licznikKotow = 0;

    // Konstruktor bez parametrów
    public Kot() {
        licznikKotow++;
    }

    // Metoda statyczna do resetowania licznika kotów
    public static void resetLicznikKotow() {
        licznikKotow = 0;
    }
}