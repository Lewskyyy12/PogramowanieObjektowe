
public class main {

public static void main(String[] args) {
    Produkt kaszanka = new Produkt("Kaszanka",2.45,20);
    Produkt jablka = new Produkt("Jablka",2.55,30);
    Produkt chipsy = new Produkt("Chipsy",3.25,40);
    Produkt Zubrowka = new Produkt("Zubrowka",24.25,100);
    KoszykZakupowy koszyk = new KoszykZakupowy();
    koszyk.dodajProdukt(kaszanka,15);
    koszyk.dodajProdukt(jablka,15);
    koszyk.dodajProdukt(chipsy,45);
    koszyk.dodajProdukt(Zubrowka,20);
    koszyk.dodajProdukt(Zubrowka,20);
    KoszykZakupowy drugikoszyk = new KoszykZakupowy();
    drugikoszyk.dodajProdukt(kaszanka,10);
    drugikoszyk.dodajProdukt(jablka,10);
    drugikoszyk.dodajProdukt(chipsy,10);
    System.out.println(koszyk.obliczCalkowitaWartosc());
    Zamowienie drugiezamowienie = new Zamowienie(drugikoszyk);
    Zamowienie zamowienie = new Zamowienie(koszyk);
    zamowienie.ustawStausZamowienia("W realizacji");
    Klient Dawid = new Klient("Dawid","Lewandowski",zamowienie);
    Dawid.dodajZamowienie(drugiezamowienie);
    Dawid.wyswietlHistorieZamowien();
    Dawid.obliczLacznyKosztZamowien();
}
}