public class Codegym005 {
    
    public static void main(String[] args) {
        Kot kot = new Kot();
        Pies pies = new Pies();
        Ryba ryba = new Ryba();
        Kobieta kobieta = new Kobieta();
        kot.wlasciciel = kobieta;
        pies.wlasciciel = kobieta;
        ryba.wlasciciel = kobieta;

    }

    public static class Kot {
        public Kobieta wlasciciel;
    }

    public static class Pies {
        public Kobieta wlasciciel;
    }

    public static class Ryba {
        public Kobieta wlasciciel;
    }

    public static class Kobieta {
    }
}
