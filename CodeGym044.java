public class CodeGym044 {
    
    public static void main(String[] args) {
        // tutaj wpisz swój kod
        for(int i =0; i< 50000;i++){
            Kot kot = new Kot();
            Pies pies = new Pies();
        }
    }
}

class Kot {
    public static int licznikKotow;

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Kot został zniszczony");
    }
}

class Pies {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Pies został zniszczony");
    }
}
