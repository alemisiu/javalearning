public class CodeGym045 {
    private static int licznikKotow = 0;


        public CodeGym045() {
            licznikKotow++;
        }
    
        @Override
        protected void finalize() throws Throwable {
            licznikKotow--;
            super.finalize();
        }
    
        public static void main(String[] args) {
            // Możesz przetestować klasę tutaj
            CodeGym045 kot1 = new CodeGym045();
            CodeGym045 kot2 = new CodeGym045();
            System.out.println("Licznik kotów: " + licznikKotow);
        }
    }

// W konstruktorze klasy Kot, tj. public Kot(), zwiększ licznik kotów (zmienna statyczna klasy Kot licznikKotow) o 1. Zmniejsz go o 1 w metodzie finalize.

// Requirements: • Dodaj konstruktor bez parametrów do klasy Kot, tj. public Kot(). • Konstruktor musi zwiększać wartość zmiennej licznikKotow o 1. • Dodaj metodę finalizuj do klasy Kot. • Metoda finalizuj nie powinna nic zwracać (zwracany typ jest void). • Metoda finalizuj powinna zmniejszać zmienną licznikKotow o 1.