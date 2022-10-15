package org.example.lab1.zadanie;

public class KoktajlSmakowy extends Koktajl implements Smakowalne {
    private final RodzajSmaku rodzajSmaku;

    protected KoktajlSmakowy(
            int kcal,
            final RodzajSmaku rodzajSmaku
    ) {
        super(kcal);
        this.rodzajSmaku = rodzajSmaku;
    }

    @Override
    public void pij() {
        System.out.println("Pije koktajl " + rodzajSmaku + " ktory jest " + rodzajSmaku.getPoziomSlodkosci());
    }

    @Override
    public RodzajSmaku smak() {
        return rodzajSmaku;
    }
}
