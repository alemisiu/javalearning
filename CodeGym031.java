
/* 
Utwórz klasę Pies
*/

public class  CodeGym031 {
    //tutaj wpisz swój kod
    private String imie;
    private int wzrost;
    private String kolor;
    
    public void inicjalizuj(String imie){
        this.imie=imie;
    }
    public void inicjalizuj(String imie, int wzrost ){
    this.imie=imie;
    this.wzrost =wzrost;
    }
    
    public void inicjalizuj(String imie,int wzrost, String kolor){
        this.imie = imie;
        this.wzrost = wzrost;
        this.kolor =kolor;
    }
    
    public static void main(String[] args) {
        
    }
}