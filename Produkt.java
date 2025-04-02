public class Produkt {
    private int idProduktu;
    private String nazwaProduktu;
    private String kategoriaProduktu;
    private double cenaProduktu;
    private int iloscWMagazynie;

    public Produkt(int idProduktu, String nazwaProduktu, String kategoriaProduktu, double cenaProduktu, int iloscWMagazynie) {
        this.idProduktu = idProduktu;
        this.nazwaProduktu = nazwaProduktu;
        this.kategoriaProduktu = kategoriaProduktu;
        this.cenaProduktu = cenaProduktu;
        this.iloscWMagazynie = iloscWMagazynie;
    }

    public int getIdProduktu() {
        return idProduktu;
    }

    public void setIdProduktu(int idProduktu) {
        this.idProduktu = idProduktu;
    }

    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public String getKategoriaProduktu() {
        return kategoriaProduktu;
    }

    public void setKategoriaProduktu(String kategoria) {
        this.kategoriaProduktu = kategoria;
    }

    public double getCenaProduktu() {
        return cenaProduktu;
    }

    public void setCenaProduktu(double cena) {
        this.cenaProduktu = cena;
    }

    public double getIloscWMagazynie() {
        return iloscWMagazynie;
    }

    public void setIloscWMagazynie(int ilosc) {
        this.iloscWMagazynie = ilosc;
    }


    public void wyswietlInformacje() {
        System.out.println("ID Produktu: " + idProduktu + " | Produkt: " + nazwaProduktu + " | Kategoria: " + kategoriaProduktu +
                " | Cena: " + cenaProduktu + " PLN | Ilość: " + iloscWMagazynie);
    }
}