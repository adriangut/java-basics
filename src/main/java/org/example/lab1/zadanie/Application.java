package org.example.lab1.zadanie;

public class Application {
    public static void main(String[] args) {
        KoktajlTruskawkowy koktajlTruskawkowy = new KoktajlTruskawkowy(
                300,
                RodzajTruskawki.ANANASOWA
        );
        koktajlTruskawkowy.jedz();
        koktajlTruskawkowy.pij();

        KoktajlSmakowy koktajlSmakowy = new KoktajlSmakowy(
                123,
                RodzajSmaku.SZPINAKOWY
        );
        koktajlSmakowy.jedz();
    }

    public static int test(int myVar) {
        return myVar * 2;
    }
}
