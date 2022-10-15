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
public enum RodzajSmaku {
    TRUSKAWKOWY(PoziomSlodkosci.LEKKO_SLODKI),
    BANANOWY(PoziomSlodkosci.BARDZO_SLODKI),
    SZPINAKOWY(PoziomSlodkosci.NIESLODKI),
    CIASTECZKOWY(PoziomSlodkosci.BARDZO_SLODKI),
    JABLKOWY(PoziomSlodkosci.SREDNIO_SLODKI);

    final PoziomSlodkosci poziomSlodkosci;
    RodzajSmaku(final PoziomSlodkosci poziomSlodkosci) {
        this.poziomSlodkosci = poziomSlodkosci;
    }

    public PoziomSlodkosci getPoziomSlodkosci() {
        return poziomSlodkosci;
    }
}
