Utwórz 5 jednostek Zerg, 3 jednostki Protoss i 4 jednostki Terran.
Nadaj im wszystkim unikalne nazwy.

Requirements:
Nie zmieniaj klas Zerg, Protoss i Terranin.
Utwórz 5 obiektów Zerg i nazwij każdy z nich.
Utwórz 3 obiekty Protoss i nazwij każdy z nich.
Utwórz 4 obiekty Terranin i nazwij każdy z nich.

/* 
Witaj, StarCraft!
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
           Zerg zerg1 = new Zerg();
           zerg1.imie = "unikalny1";
           Zerg zerg2 = new Zerg();
           zerg2.imie = "unikalny2";
            Zerg zerg3 = new Zerg();
            zerg3.imie = "unikalny3";
            
             Zerg zerg4 = new Zerg();
             zerg4.imie = "unikalny4";
              Zerg zerg5 = new Zerg();
            zerg5.imie = "unikalny5";
        
        
        Protoss protoss1 = new Protoss();
        protoss1.imie = "Damian";
           Protoss protoss2 = new Protoss();
           protoss2.imie = "Zeratul";
              Protoss protoss3 = new Protoss();
        protoss3.imie = "tadziu";
        
        
        Terranin terrarin1 = new Terranin();
        terrarin1.imie = "Alek";
        
          Terranin terrarin2 = new Terranin();
        terrarin2.imie = "Damien";
        
        
          Terranin terrarin3 = new Terranin();
        terrarin3.imie = "franek";
        
          Terranin terrarin4 = new Terranin();
        terrarin4.imie = "Slawek";
      
          
    }

    public static class Zerg {
        public String imie;
    }

    public static class Protoss {
        public String imie;
    }

    public static class Terranin {
        public String imie;
    }
}
