package org.example.lab1.zadanie;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {
        int index = new Random().nextInt(0, RodzajTruskawki.values().length);
        RodzajTruskawki rodzajTruskawki = RodzajTruskawki.values()[index];
        System.out.println("Wylosowano " + rodzajTruskawki);
        int sizeFromStatement = switchStatement(rodzajTruskawki);
        int sizeFromExpression = switchExpression(rodzajTruskawki);
    }

    private static int switchStatement(RodzajTruskawki rodzajTruskawki) {
        System.out.println("Switch statement");
        final int size;
        switch (rodzajTruskawki) {
            case ANANASOWA:
                System.out.println(rodzajTruskawki);
                size = 1;
                break;
            case HONEOYE:
                System.out.println(rodzajTruskawki);
                size = 2;
                break;
            case POLKA:
                System.out.println(rodzajTruskawki);
                size = 3;
                break;
            case KENT:
                System.out.println(rodzajTruskawki);
                size = 4;
                break;
            case CHRISTINE:
                System.out.println(rodzajTruskawki);
                size = 5;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + rodzajTruskawki);
        }
        return size;
    }

    private static int switchExpression(RodzajTruskawki rodzajTruskawki) {
        System.out.println("Switch expression");
        return switch (rodzajTruskawki) {
            case ANANASOWA -> {
                System.out.println(rodzajTruskawki);
                yield 1;
            }
            case HONEOYE -> {
                System.out.println(rodzajTruskawki);
                yield 2;
            }
            case POLKA -> extraMethod(rodzajTruskawki);
            case KENT -> {
                System.out.println(rodzajTruskawki);
                yield 4;
            }
            case CHRISTINE -> {
                System.out.println(rodzajTruskawki);
                yield 5;
            }
            case BRAND_NEW -> {
                System.out.println(rodzajTruskawki);
                yield 6;
            }
            case SUPER_NEW -> 7;
        };
    }
    private static int extraMethod(RodzajTruskawki rodzajTruskawki) {
        System.out.println(rodzajTruskawki);
        return 3;
    }
}
