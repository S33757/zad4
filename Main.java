public class Main {
    public static void main(String[] args) {
        SklepKomputerowy sklep = new SklepKomputerowy();

        //Produkty-----------------------------------------------------------------------------------------------
        Produkt laptop = new Produkt(1, "Laptop Lenovo", "Laptop", 5000, 10);
        sklep.dodajProdukt(laptop);

        //Klienci------------------------------------------------------------------------------------------------------------------
        Klient Hubert = new Klient(1, "Hubert", "Bogucki", "s33757@pjwstk.edu.pl", false);
        sklep.dodajKlienta(Hubert);

        //Zamowienia-------------------------------------------------------------------------------------------------
        Zamowienie pierwsze = sklep.utworzZamowienie(Hubert, new Produkt[]{laptop}, new int[]{1});
        pierwsze.wyswietlSzczegoly();
        pierwsze.obliczWartoscZamowienia();


        //Sprawdzenie
        //laptop.wyswietlInformacje();
        //System.out.println();
        //Hubert.wyswietlKlient();
        //System.out.println();

    }
}
