package org.example.lab1.zadanie;

public class Application {
    public static void main(String[] args) {
        KoktajlTruskawkowy koktajlTruskawkowy = new KoktajlTruskawkowy(
                300,
                RodzajTruskawki.ANANASOWA
        );
        koktajlTruskawkowy.jedz();
        koktajlTruskawkowy.pij();

        int myVar = 5;
        int myNewVar = test(myVar);
        System.out.println(myNewVar);
    }

    public static int test(int myVar) {
        return myVar * 2;
    }
}
