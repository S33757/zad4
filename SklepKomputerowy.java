import java.util.ArrayList;

public class SklepKomputerowy {
    private ArrayList<Produkt> produkty = new ArrayList<>();
    private ArrayList<Klient> klienci = new ArrayList<>();
    private ArrayList<Zamowienie> zamowienia = new ArrayList<>();

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
    }

    public void dodajKlienta(Klient klient) {
        klienci.add(klient);
    }

    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosc) {
        Zamowienie zamowienie = new Zamowienie(zamowienia.size() + 1, klient, produkty, ilosc, "01-04-2025", "Nowe");
        zamowienia.add(zamowienie);
        return zamowienie;
    }
}
