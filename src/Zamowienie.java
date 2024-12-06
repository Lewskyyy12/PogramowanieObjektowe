public class Zamowienie {
    private KoszykZakupowy koszyk;
    private String statusZamowienia;

    public Zamowienie(KoszykZakupowy koszyk) {
        this.koszyk = koszyk;
        this.statusZamowienia = "W realizacji";
    }
    public void ustawStausZamowienia(String Status){
        this.statusZamowienia = Status;
    }
    public void wyswietlZamowienia(){
        koszyk.wyswietlZawartoscKoszyka();
        System.out.println(statusZamowienia);
    }

    public KoszykZakupowy getKoszyk() {
        return koszyk;
    }
}
