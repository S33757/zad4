public class Zamowienie {
    private int id;
    Klient klient;
    private Produkt[] produkty;
    private int[] ilosc;
    private String dataZamowienia;
    private String status;

    public Zamowienie(int idZamowienia, Klient klient, Produkt[] produkty, int[] ilosc, String dataZamowienia, String status) {
        this.id = idZamowienia;
        this.klient = klient;
        this.produkty = produkty;
        this.ilosc = ilosc;
        this.dataZamowienia = dataZamowienia;
        this.status = status;
    }

    public double obliczWartoscZamowienia() {
        double suma = 0;
        for (int i = 0; i < produkty.length; i++) {
            suma += produkty[i].getCena() * ilosc[i];
        }
        return klient.isCzyStaly() ? suma * 0.9 : suma;
    }

    public void wyswietlSzczegoly() {
        System.out.println("Zamowienie: " + id + " Klient: " + klient.getImie() + " " + klient.getNazwisko());
        for (int i = 0; i < produkty.length; i++) {
            System.out.println(produkty[i].getNazwa() + " x" + ilosc[i]);
        }
        System.out.println("Laczna wartosc zamowienia: " + obliczWartoscZamowienia() + "zl Status: " + status);
    }

    // === Nowe brakujące metody ===
    public int getId() {
        return id;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public int[] getIlosci() {
        return ilosc;
    }

    public void zastosujZnizke() {
        System.out.println("Znizka została uwzgledniona automatycznie");
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Klient getKlient() {
        return klient;
    }
}
