import java.util.ArrayList;

public class KoszykZakupowy implements KoszykZak{
    private ArrayList<Produkt> listaProduktów;

    public KoszykZakupowy() {
        this.listaProduktów = new ArrayList();
    }

    @Override

    public void dodajProdukt(Produkt produkt, int ilosc){
        if(produkt.getIloscNaMagazynie() > ilosc){
            Produkt produktDoListy = new Produkt(produkt.getNazwa(), produkt.getCena(), produkt.getIloscNaMagazynie());
            produkt.usunZMagazynu(ilosc);
            produktDoListy.setIloscNaMagazynie(ilosc);
            listaProduktów.add(produktDoListy);
        }
        else System.out.println("Brak ilosci na magzynie");
    }
    @Override

    public void wyswietlZawartoscKoszyka(){
        for(int i=0;i<listaProduktów.size();i++){
            System.out.println(listaProduktów.get(i).getNazwa());
            System.out.println(listaProduktów.get(i).getIloscNaMagazynie());
        }
    }
    @Override

    public double obliczCalkowitaWartosc(){
        double wartoscKoszyka = 0;
        for(int i =0;i<listaProduktów.size();i++){
            wartoscKoszyka += listaProduktów.get(i).getIloscNaMagazynie()*listaProduktów.get(i).getCena();
        }
        return wartoscKoszyka;
    }

    public ArrayList<Produkt> getListaProduktów() {
        return listaProduktów;
    }
}
