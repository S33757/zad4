public class Main {
    public static void main(String[] args) {
        SklepKomputerowy sklep = new SklepKomputerowy();

        //Produkty-----------------------------------------------------------------------------------------------
        Produkt laptop = new Produkt(1, "Laptop Lenovo", "Laptop", 5000, 10);
        sklep.dodajProdukt(laptop);

        Produkt mysz = new Produkt(2, "Mysz Logitech", "Mysz", 500, 120);
        sklep.dodajProdukt(mysz);

        Produkt monitor = new Produkt(3, "Monitor Iiyama", "Monitor", 1500, 75);
        sklep.dodajProdukt(monitor);

        //Klienci------------------------------------------------------------------------------------------------------------------
        Klient Hubert = new Klient(1, "Hubert", "Bogucki", "s33757@pjwstk.edu.pl", true);
        sklep.dodajKlienta(Hubert);

        Klient Adam = new Klient(2, "Adam", "Nowak", "adam.nowak@gmail.com", false);
        sklep.dodajKlienta(Adam);

        Klient Klaudia = new Klient(3, "Klaudia", "Kowalska", "klaudia.kowalska@gmail.com", true);
        sklep.dodajKlienta(Klaudia);

        Klient Rafal = new Klient(4, "Rafal", "Szybki", "rafal.szybki@gmail.com", false);
        sklep.dodajKlienta(Rafal);

        //Zamowienia-------------------------------------------------------------------------------------------------
        Zamowienie pierwsze = sklep.utworzZamowienie(Hubert, new Produkt[]{laptop}, new int[]{1});
        System.out.println("PIERWSZE ZAMOWIENIE: ");
        pierwsze.wyswietlSzczegoly();
        pierwsze.obliczWartoscZamowienia();

        Zamowienie drugie = sklep.utworzZamowienie(Adam, new Produkt[]{mysz, monitor}, new int[]{1, 2});
        System.out.println("DRUGIE ZAMOWIENIE: ");
        drugie.wyswietlSzczegoly();
        drugie.obliczWartoscZamowienia();

        Zamowienie trzecie = sklep.utworzZamowienie(Klaudia, new Produkt[]{mysz}, new int[]{10});
        System.out.println("TRZECIE ZAMOWIENIE: ");
        trzecie.wyswietlSzczegoly();
        trzecie.obliczWartoscZamowienia();

        Zamowienie czwarte = sklep.utworzZamowienie(Rafal, new Produkt[]{laptop,mysz,monitor}, new int[]{3,3,3});
        System.out.println("CZWARTE ZAMOWIENIE: ");
        czwarte.wyswietlSzczegoly();
        czwarte.obliczWartoscZamowienia();


        //Sprawdzenie
        //laptop.wyswietlInformacje();
        //System.out.println();
        //Hubert.wyswietlKlient();
        //System.out.println();

    }
}
