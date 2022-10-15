package org.example.lab1.zadanie;

public class KoktajlTruskawkowy extends Koktajl implements Smakowalne {
    private final RodzajTruskawki rodzajTruskawki;
    private final RodzajSmaku rodzajSmaku;

    public KoktajlTruskawkowy(
            int kcal,
            final RodzajTruskawki rodzajTruskawki,
            final RodzajSmaku rodzajSmaku
    ) {
        super(kcal);
        this.rodzajTruskawki = rodzajTruskawki;
        this.rodzajSmaku= rodzajSmaku;
    }

    @Override
    public RodzajSmaku smak() {
        return rodzajSmaku;
    }

    @Override
    public void pij() {
        System.out.println(
                "Pije koktajl o smaku "
                        + smak()
                        + ", która cechuje się "
                        + rodzajTruskawki.getCecha()
                        + ". Koktajl jest "
                        + rodzajSmaku.getPoziomSlodkosci()
        );
        String message = String.format(
                "Pije koktajl o smaku %s, która cechuje się %s",
                smak(),
                rodzajTruskawki.getCecha()
        );
        System.out.println(message);
    }
}
