public class Main {
    public static void main(String[] args) {
        SklepKomputerowy sklep = new SklepKomputerowy();

        Produkt laptop = new Produkt(1, "Laptop Lenovo", "Laptop", 5000, 10);
        Klient Hubert = new Klient(1, "Hubert", "Bogucki", "s33757@pjwstk.edu.pl", true);

        laptop.wyswietlInformacje();
        Hubert.wyswietlKlient();
    }
}
