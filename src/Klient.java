import java.util.ArrayList;

public class Klient {
    private String imie;
    private String nazwisko;
    private ArrayList<Zamowienie> listaZamowien = new ArrayList<>();

    public Klient(String imie, String nazwisko, Zamowienie zamowiemie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        listaZamowien.add(zamowiemie);
    }
    public void dodajZamowienie(Zamowienie zamowiene) {
            listaZamowien.add(zamowiene);
    }
    public void wyswietlHistorieZamowien(){
        for  (Zamowienie i : listaZamowien){
            i.wyswietlZamowienia();
        }
    }
    public void obliczLacznyKosztZamowien(){
        double wartoscCalkowita =0;
        for(Zamowienie z : listaZamowien){
            wartoscCalkowita+=z.getKoszyk().obliczCalkowitaWartosc();
        }
        System.out.println(wartoscCalkowita);
    }
}
