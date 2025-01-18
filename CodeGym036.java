public class CodeGym036 {
    public static void main(String[] args) {
        var mezczyzna1 = new Mezczyzna("Jan", 25, "Warszawa");
        var mezczyzna2 = new Mezczyzna("Adam",40,"Krakow");


        var kobieta1 = new Kobieta("Anna", 30, "Gdansk");
        var kobieta2 = new Kobieta("Ewa", 35, "Poznan");


        System.out.println(mezczyzna1);
        System.out.println(mezczyzna2);
        System.out.println(kobieta1);
        System.out.println(kobieta2);
    }

    public static class Mezczyzna {
        private String imie;
        private int wiek;
        private String adres;

        public Mezczyzna(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }

        public String toString() {
            return imie + " " + wiek + " " + adres;
        }
    }
    public static class Kobieta{
        private String imie;
        private int wiek;
        private String adres;

        public Kobieta(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }

        public String toString() {
            return imie + " " + wiek + " " + adres;
        }
    }
    
}
