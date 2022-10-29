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
        // Zadanie:
        // Przy użyciu switch statement do sformatowanej wiadomości dodaj
        // na podstawie rodzaju smaku informację o tym, czy smak jest: OWOCOWY, WARZYWNY, INNY
        // informacja ta powinna pochodzić z nowej metody zrodloSmaku, która zwraca nowy enum ZrodloSmaku
        // metoda powinna zostać umieszczona w klasie KoktajlSmakowy
        System.out.println(
                "Pije koktajl o smaku "
                        + smak()
                        + ". Koktajl jest "
                        + zrodloSmakuStatement(smak())
                        + " oraz "
                        + smak().getPoziomSlodkosci()
        );
        String message = String.format(
                "Pije koktajl o smaku %s. Koktajl jest %s.",
                smak(),
                zrodloSmakuExpression(smak())
        );
        System.out.println(message);
    }



    @Override
    public RodzajSmaku smak() {
        return rodzajSmaku;
    }

    public ZrodloSmaku zrodloSmakuStatement(RodzajSmaku rodzajSmaku) {
        ZrodloSmaku zrodloSmaku;
        switch (rodzajSmaku) {
            case TRUSKAWKOWY:
            case BANANOWY:
            case JABLKOWY:
                zrodloSmaku = ZrodloSmaku.OWOCOWY;
                break;
            case SZPINAKOWY:
                zrodloSmaku = ZrodloSmaku.WARZYWNY;
                break;
            case CIASTECZKOWY:
                zrodloSmaku = ZrodloSmaku.INNY;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + rodzajSmaku);
        }
        return zrodloSmaku;
    }

    public ZrodloSmaku zrodloSmakuExpression(RodzajSmaku rodzajSmaku) {
        return switch (rodzajSmaku) {
            case TRUSKAWKOWY, BANANOWY, JABLKOWY -> ZrodloSmaku.OWOCOWY;
            case SZPINAKOWY -> ZrodloSmaku.WARZYWNY;
            case CIASTECZKOWY -> ZrodloSmaku.INNY;
        };
    }
}
