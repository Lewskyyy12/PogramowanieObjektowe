import java.util.ArrayList;

public class Sklep {
    private ArrayList<Produkt> produkty;

    public Sklep() {
        this.produkty = new ArrayList<>();
    }
    public void dodajProdukt(Produkt produkt) {
        this.produkty.add(produkt);
    }
    public void wyswietlOferty(){
        for(Produkt produkt : produkty){
            System.out.println(produkt.getNazwa());
        }
    }
    public void wyszukajProdukt(String nazwa){
        for(Produkt produkt : produkty){
            if(produkt.getNazwa().equals(nazwa)){
                produkt.wyswietlInformacje();
            }
        }
    }
    public void zakupy(KoszykZakupowy koszyk,Produkt produkt ,int ilosc){
        for(Produkt produkt2 : produkty){
            if(produkt2.equals(produkt)){
                if(produkt2.getIloscNaMagazynie() > ilosc){
                    koszyk.dodajProdukt(produkt,ilosc);
                }
                break;
            }

        }

    }
}

