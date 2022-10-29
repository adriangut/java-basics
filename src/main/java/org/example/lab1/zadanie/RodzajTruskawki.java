package org.example.lab1.zadanie;

public enum RodzajTruskawki {
    ANANASOWA("Białe owoce"),
    HONEOYE("Wyrazista"),
    POLKA("Najsmaczniejsza"),
    KENT("Dla fanów słodyczy"),
    CHRISTINE("Zaowocuje szybko i obficie"),
    BRAND_NEW("Zawiera wszystkie potrzebne witaminy i minerały;"),
    SUPER_NEW("");

    private final String cecha;

    RodzajTruskawki(final String cecha) {
            this.cecha = cecha;
    }

    public String getCecha() {
        return cecha;
    }
}
