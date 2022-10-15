package org.example.lab1.zadanie;

/**
 * Zadanie:
 * Utwórz enum RodzajSmaku zawierający wartości:
 * Troskawkowy
 * Bananowy
 * Szpinakowy
 * Ciasteczkowy
 * Jabłkowy
 * enum powinien przechowywać informację o poziomie słodkości
 * (int albo enum, poziomy do ustalenia według indywidualnych preferencji)
 *
 * A następnie zmodyfikować interfejs Smakowy
 * tak aby zwracał rodzaj smaku i dostosować resztę programu
 *
 */
public class Application {
    public static void main(String[] args) {
        KoktajlTruskawkowy koktajlTruskawkowy = new KoktajlTruskawkowy(
                300,
                RodzajTruskawki.ANANASOWA,
                RodzajSmaku.TRUSKAWKOWY
        );
        koktajlTruskawkowy.jedz();
        koktajlTruskawkowy.pij();

//        int myVar = 5;
//        int myNewVar = test(myVar);
//        System.out.println(myNewVar);
    }

    public static int test(int myVar) {
        return myVar * 2;
    }
}
