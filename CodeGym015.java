public class CodeGym015 {
    

public static int sumaCyfrLiczby(int liczba) {
    int suma = 0;

    // Wyciągamy cyfry
    suma += liczba % 10; // Ostatnia cyfra
    liczba /= 10;        // Usunięcie ostatniej cyfry

    suma += liczba % 10; // Druga cyfra
    liczba /= 10;        // Usunięcie drugiej cyfry

    suma += liczba % 10; // Pierwsza cyfra
    
    return suma;
}

public static void main(String[] args) {
    int wynik = sumaCyfrLiczby(546);
    System.out.println("Suma cyfr liczby 546 to: " + wynik);
}
}