public class CodeGym018 {
    
  
        public static void main(String[] args) {
            sprawdzPoreRoku(12);
            sprawdzPoreRoku(4);
            sprawdzPoreRoku(7);
            sprawdzPoreRoku(10);
        }
        public static void sprawdzPoreRoku(int miesiac) {
            // Używamy operatora OR (||), aby sprawdzić poprawnie pory roku
            if (miesiac == 12 || miesiac == 1 || miesiac == 2) {
                System.out.println("zima");
            } else if (miesiac == 3 || miesiac == 4 || miesiac == 5) {
                System.out.println("wiosna");
            } else if (miesiac == 6 || miesiac == 7 || miesiac == 8) {
                System.out.println("lato");
            } else if (miesiac == 9 || miesiac == 10 || miesiac == 11) {
                System.out.println("jesień");
            } else {
                System.out.println("Nieprawidłowy miesiąc");
            }
        }
    }