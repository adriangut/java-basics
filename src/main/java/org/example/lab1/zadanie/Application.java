package org.example.lab1.zadanie;

public class Application {
    public static void main(String[] args) {
        KoktajlTruskawkowy koktajlTruskawkowy = new KoktajlTruskawkowy(
                300,
                RodzajTruskawki.ANANASOWA
        );
        koktajlTruskawkowy.jedz();
        koktajlTruskawkowy.pij();


    }

    public static int test(int myVar) {
        return myVar * 2;
    }
}
