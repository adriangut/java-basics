package org.example.lab1.zadanie;

public class KoktajlTruskawkowy extends Koktajl implements Smakowalne {
    private final RodzajTruskawki rodzajTruskawki;

    public KoktajlTruskawkowy(
            int kcal,
            final RodzajTruskawki rodzajTruskawki
    ) {
        super(kcal);
        this.rodzajTruskawki = rodzajTruskawki;
        System.out.println(this.rodzajTruskawki.getCecha());
    }

    @Override
    public String smak() {
        return "Truskawkowy";
    }

    @Override
    public void pij() {
        System.out.println(
                "Pije koktajl o smaku " + smak() + ", która cechuje się " + rodzajTruskawki.getCecha()
        );
        String message = String.format(
                "Pije koktajl o smaku %s, która cechuje się %s",
                smak(),
                rodzajTruskawki.getCecha()
        );
        System.out.println(message);
    }
}
