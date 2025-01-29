class CodeGym054 {
    public static void main(String[] args) {
        // Utworzenie 10 obiektów klasy Kot
        for (int i = 0; i < 10; i++) {
            new Kot();
        }

        // Wyświetlenie wartości zmiennej licznikKotow
        System.out.println("Licznik kotów: " + Kot.licznikKotow);
    }
}

class Kot {
    public static int licznikKotow = 0;

    // Konstruktor bez parametrów
    public Kot() {
        licznikKotow++;
    }
}