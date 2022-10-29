package org.example.lab1.zadanie;

public class KoktajlTruskawkowy extends KoktajlSmakowy {
    private final RodzajTruskawki rodzajTruskawki;

    public KoktajlTruskawkowy(
            int kcal,
            final RodzajTruskawki rodzajTruskawki
    ) {
        super(kcal, RodzajSmaku.TRUSKAWKOWY);
        this.rodzajTruskawki = rodzajTruskawki;
    }

    @Override
    public void pij() {
        System.out.println(
                "Pije koktajl "
                        + smak()
                        + ", która cechuje się "
                        + rodzajTruskawki.getCecha()
                        + ". Koktajl jest "
                        + smak().getPoziomSlodkosci()
        );
        String message = String.format(
                "Pije koktajl %s, która cechuje się %s",
                smak(),
                rodzajTruskawki.getCecha()
        );
        System.out.println(message);
    }
}
