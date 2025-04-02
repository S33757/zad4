public class Zamowienie {
    private int idZamowienia;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosc;
    private String dataZamowienia;
    private String status;

    public Zamowienie(int idZamowienia, Klient klient, Produkt[] produkty, int[] ilosc, String dataZamowienia, String status) {
        this.idZamowienia = idZamowienia;
        this.klient = klient;
        this.produkty = produkty;
        this.ilosc = ilosc;
        this.dataZamowienia = dataZamowienia;
        this.status = status;
    }

    public double obliczWartoscZamowienia(){
        double suma = 0;
        for (int i = 0; i < produkty.length; i++) {
            suma += produkty[i].getCenaProduktu() * ilosc[i];
        }
        return klient.isCzyStaly() ? suma * 0.9 : suma;
    }

    public void wyswietlSzczegoly(){
        System.out.println("Zamowienie #" + idZamowienia + " Klient: " + klient.getImie() + " " + klient.getNazwisko()); // Poprawione wywołanie getNazwisko()
        for (int i = 0; i < produkty.length; i++) {
            System.out.println(produkty[i].getNazwaProduktu() + " x" + ilosc[i]);
        }
        System.out.println("Laczna wartosc zamowienia: " + obliczWartoscZamowienia() + "zl Status: " + status);
    }

    public int getIdZamowienia() {
        return idZamowienia;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
