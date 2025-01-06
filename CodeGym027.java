public class CodeGym027 {

    public static void main(String[] args) {
        // tutaj wpisz swój kod

        Kot kot1 = new Kot("Mruczek",2,5,10);
        Kot kot2 = new Kot("puszek",3,6,11);
        Kot kot3 = new Kot("Filemon",1,4,8);
        
    }

    public static class Kot {
        public String imie;
        protected int wiek;
        int waga;
        private int sila;

        public Kot(String imie, int wiek, int waga, int sila) {
            this.imie = imie;
            this.wiek = wiek;
            this.waga = waga;
            this.sila = sila;
        }
    }
}