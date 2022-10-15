package org.example.lab1.zadanie;

public enum RodzajTruskawki {
    ANANASOWA("Białe owoce"),
    HONEOYE("Wyrazista"),
    POLKA("Najsmaczniejsza"),
    KENT("Dla fanów słodyczy"),
    CHRISTINE("Zaowocuje szybko i obficie");

    private final String cecha;

    RodzajTruskawki(final String cecha) {
            this.cecha = cecha;
    }

    public String getCecha() {
        return cecha;
    }
}
