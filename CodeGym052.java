public class CodeGym052 {

    
  public static void main(String[] args) {
        // Możesz przetestować metody tutaj
        System.out.println(multiply("Amigo", 3)); // AmigoAmigoAmigo
        System.out.println(multiply("Amigo"));    // AmigoAmigoAmigoAmigoAmigo
    }

    // Metoda multiply(String s, int licznik)
    public static String multiply(String s, int licznik) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < licznik; i++) {
            result.append(s);
        }
        return result.toString();
    }

    // Metoda multiply(String s)
    public static String multiply(String s) {
        return multiply(s, 5);
    }
}