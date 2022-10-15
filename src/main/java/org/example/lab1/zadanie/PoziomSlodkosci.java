package org.example.lab1.zadanie;

public enum PoziomSlodkosci {
    NIESLODKI,
    LEKKO_SLODKI,
    SREDNIO_SLODKI,
    BARDZO_SLODKI;

    @Override
    public String toString() {
        return this.name().replace('_', ' ').toLowerCase();
    }
}
