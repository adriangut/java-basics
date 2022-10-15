package org.example.lab1.zadanie;

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

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
