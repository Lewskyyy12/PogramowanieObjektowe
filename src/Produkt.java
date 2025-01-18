public class Produkt implements Produkcik{
    private String nazwa;
    private double cena;
    private int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }
    @Override

    public void wyswietlInformacje(){
        System.out.println("Nazwa: " + nazwa + "\ncena: " + cena + "\nilosc na Magazynie: " + iloscNaMagazynie);
    }
    @Override
    public void dodajDoMagazynu(int ilosc){
        iloscNaMagazynie += ilosc;
    }
    @Override
    public void usunZMagazynu(int ilosc){
        if(iloscNaMagazynie > ilosc){
            iloscNaMagazynie -= ilosc;
        }
        else System.out.println("Brak odpowiedniej ilosci na magazynie");
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }
}
