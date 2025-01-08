public class Codegym028 {
    public static void main(String[] args) {
        // tutaj wpisz swój kod
        Kot kot1 = new Kot("Mruczek", 3, 6, 11);
        Kot kot2 = new Kot("Puszek", 7, 4, 12);
        Kot kot3 = new Kot("Filemon", 1, 5, 7);

        System.out.println("Kot2 vs Kot3: " + kot2.walka(kot3));

        System.out.println("Kot2 vs Kot3: " + kot2.walka(kot3));
        System.out.println("Kot3 vs Kot1: " + kot3.walka(kot1));
    }

    public static class Kot {
        protected String imie;
        protected int wiek;
        protected int waga;
        protected int sila;

        public Kot(String imie, int wiek, int waga, int sila) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.sila = sila;
        }

        public boolean walka(Kot innyKot) {
            int wiekPrzewaga = this.wiek > innyKot.wiek ? 1 : 0;
            int wagaPrzewaga = this.waga > innyKot.waga ? 1 : 0;
            int silaPrzewaga = this.sila > innyKot.sila ? 1 : 0;

            int wynik = wiekPrzewaga + wagaPrzewaga + silaPrzewaga;
            return wynik > 2; // return wynik > 2 ? true : false;
        }
    }
}
