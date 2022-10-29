package org.example.lab1.zadanie;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        int index = new Random().nextInt(0, RodzajTruskawki.values().length);
        RodzajTruskawki rodzajTruskawki = RodzajTruskawki.values()[index];
        System.out.println("Wylosowano " + rodzajTruskawki);
        switchStatement(rodzajTruskawki);
    }

    private static void switchStatement(RodzajTruskawki rodzajTruskawki) {
        switch (rodzajTruskawki) {
            case ANANASOWA:
                System.out.println(rodzajTruskawki);
                break;
            case HONEOYE:
                System.out.println(rodzajTruskawki);
                break;
            case POLKA:
                System.out.println(rodzajTruskawki);
                break;
            case KENT:
                System.out.println(rodzajTruskawki);
                break;
            case CHRISTINE:
                System.out.println(rodzajTruskawki);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + rodzajTruskawki);
        }
    }

    private static void switchExpression() {

    }
}
