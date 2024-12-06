public class Zamowienie {
    private KoszykZakupowy koszyk;
    private String statusZamowienia;
    private String platnosc;

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
    private void finalizujZamowienie(Platnosc platnosc){
        if(platnosc.getStatusPlatnosci() == "Oplacone") this.platnosc = "Gotowe do wysyłki";
    }
    private void zwrocProdukt(Produkt produkt, int ilosc){
        KoszykZakupowy koszyk = this.koszyk;
        for(Produkt produkt2 : koszyk.getListaProduktów()){
            if(produkt2.equals(produkt)){
                if(produkt2.getIloscNaMagazynie() < ilosc){
                    produkt2.setIloscNaMagazynie(produkt2.getIloscNaMagazynie() -ilosc);
                    produkt.setIloscNaMagazynie(produkt.getIloscNaMagazynie()+ilosc);
                }
                else if(produkt2.getIloscNaMagazynie() == ilosc){
                    koszyk.getListaProduktów().remove(produkt2);
                    produkt.setIloscNaMagazynie(produkt.getIloscNaMagazynie()+ilosc);
                }
                else{
                    System.out.println("Nie ma tyle w koszyku");
                }
            }


        }
    }
}
