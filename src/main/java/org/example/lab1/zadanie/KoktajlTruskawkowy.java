package org.example.lab1.zadanie;

public class KoktajlTruskawkowy extends Koktajl implements Smakowalne {
    @Override
    public void smak() {
        System.out.println("Truskawkowy");
    }

    @Override
    public void pij() {
        System.out.println("Pije koktajl");
    }
}
