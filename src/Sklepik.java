public interface Sklepik {
    void wyszukajProdukt(String nazwa);
    void dodajProdukt(Produkt produkt);
    void wyswietlOferty();
    void zakupy(KoszykZakupowy koszyk,Produkt produkt ,int ilosc);
    default void cosik(){
      System.out.println("Jestem tu domyslnie, mozesz mnie nadpisac");
    }
}
