import java.util.ArrayList;

public class Klient extends Osoba implements Kliencik {

    private ArrayList<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko) {
        super(imie, nazwisko);
        listaZamowien = new ArrayList<>();

    }

    @Override
    public void dodajZamowienie(Zamowienie zamowiene) {
            listaZamowien.add(zamowiene);
    }
    @Override
    public void wyswietlHistorieZamowien(){
        for  (Zamowienie i : listaZamowien){
            i.wyswietlZamowienia();
        }
    }
    @Override
    public void obliczLacznyKosztZamowien(){
        double wartoscCalkowita =0;
        for(Zamowienie z : listaZamowien){
            wartoscCalkowita+=z.getKoszyk().obliczCalkowitaWartosc();
        }
        System.out.println(wartoscCalkowita);
    }
    public void wypisz(){
        System.out.println(imie +" "+ nazwisko);
    }
}
