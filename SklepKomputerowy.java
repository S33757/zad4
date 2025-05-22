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

    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci) {
        Zamowienie zamowienie = new Zamowienie(zamowienia.size() + 1, klient, produkty, ilosci, "01-04-2025", "Nowe");
        zamowienia.add(zamowienie);
        return zamowienie;
    }

    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        Produkt[] zamProdukty = zamowienie.getProdukty();
        int[] zamIlosci = zamowienie.getIlosci();

        for (int i = 0; i < zamProdukty.length; i++) {
            Produkt produkt = zamProdukty[i];
            int nowaIlosc = produkt.getIloscWMagazynie() - zamIlosci[i];
            produkt.setIloscWMagazynie(nowaIlosc);
        }
    }

    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (Zamowienie zam : zamowienia) {
            if (zam.getId() == idZamowienia) {
                zam.setStatus(nowyStatus);
                System.out.println("Zmieniono status zamówienia: " + idZamowienia + " na: " + nowyStatus);
                return;
            }
        }
        System.out.println("Nie znaleziono zamowienia o ID: " + idZamowienia);
    }

    public void wyswietlProduktyWKategorii(String kategoria) {
        for (Produkt produkt : produkty) {
            if (produkt.getKategoria().equalsIgnoreCase(kategoria)) {
                produkt.wyswietlInformacje();
            }
        }
    }

    public void wyswietlZamowieniaKlienta(int idKlienta) {
        for (Zamowienie zam : zamowienia) {
            if (zam.getKlient().getId() == idKlienta) {
                zam.wyswietlSzczegoly();
            }
        }
    }
}
