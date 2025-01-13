package com.example.demo;
import java.util.ArrayList;
import java.util.Scanner;

public class Codegym029 {
    
 
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> liczby = new ArrayList<>();
        int suma = 0;
        
        while (true) {
            System.out.print("Wprowadź liczbę: ");
            int liczba = scanner.nextInt();
            if (liczba == -1) {
                break;
            }
            liczby.add(liczba);
            suma += liczba;
        }
        if (liczby.size() > 0) {
            double srednia = (double) suma / liczby.size();
            System.out.printf("Średnia arytmetyczna: %.1f%n", srednia);
        } else {
            System.out.println("Nie wprowadzono żadnych liczb.");
        }
        scanner.close();
    }
}
