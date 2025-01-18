public class Bułka extends ProduktSpozywczy{
    private String rodzaj;
    public Bułka(String nazwa,String rodzaj, int iloscNaMmagazynie, double cena){
        super(nazwa,cena,iloscNaMmagazynie);
        this.rodzaj=rodzaj;
    }

}
