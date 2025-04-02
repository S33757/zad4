public class Klient {
    private int idKlient;
    private String imie;
    private String nazwisko;
    private String email;
    private boolean czyStaly;

    public Klient(int idKlient, String imie, String nazwisko, String email, boolean czyStaly) {
        this.idKlient = idKlient;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.czyStaly = czyStaly;
    }

    public int getIdKlient() {return idKlient;}
    public String getImie() {return imie;}
    public String getNazwisko() {return nazwisko;}
    public String getEmail() {return email;}
    public boolean isCzyStaly() {return czyStaly;}

    public void wyswietlKlient() {
        System.out.println("ID Klienta: " + idKlient);
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Email: " + email);
        System.out.println("CzyStaly: " + czyStaly);
    }
}
