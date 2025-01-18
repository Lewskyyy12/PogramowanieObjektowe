import java.util.ArrayList;

record Sprawdzian(int liczba, String Sprawdzian){

}
public class main {

    public static int silnia(int liczba) {
        int wynik = 1;
        for (int i = 2; i <= liczba; i++) {
            wynik = wynik * i;
        }
        return wynik;
    }

    public static void main(String[] args) {
        Produkt kaszanka = new Produkt("Kaszanka", 2.45, 20);
        Produkt jablka = new Produkt("Jablka", 2.55, 30);
        Produkt chipsy = new Produkt("Chipsy", 3.25, 40);
        Produkt Zubrowka = new Produkt("Zubrowka", 24.25, 100);
        Produkt piwoKasztelan = new Produkt("piwoKasztelan", 3.76, 50);
        KoszykZakupowy koszyk = new KoszykZakupowy();
        koszyk.dodajProdukt(kaszanka, 15);
        koszyk.dodajProdukt(jablka, 15);
        koszyk.dodajProdukt(chipsy, 45);
        koszyk.dodajProdukt(Zubrowka, 20);
        koszyk.dodajProdukt(Zubrowka, 20);
        KoszykZakupowy drugikoszyk = new KoszykZakupowy();
        drugikoszyk.dodajProdukt(kaszanka, 10);
        drugikoszyk.dodajProdukt(jablka, 10);
        drugikoszyk.dodajProdukt(chipsy, 10);
        System.out.println(koszyk.obliczCalkowitaWartosc());
        Zamowienie drugiezamowienie = new Zamowienie(drugikoszyk);
        Zamowienie zamowienie = new Zamowienie(koszyk);
        zamowienie.ustawStausZamowienia("W realizacji");
        Klient Dawid = new Klient("Dawid", "Lewandowski");
        Dawid.dodajZamowienie(drugiezamowienie);
        Dawid.wyswietlHistorieZamowien();
        Dawid.obliczLacznyKosztZamowien();
        System.out.println("Od tad sprawdzaj");
        Sklep monopolowy = new Sklep();
        System.out.println("Asortyment monopolowego: ");
        monopolowy.dodajProdukt(Zubrowka);
        monopolowy.dodajProdukt(piwoKasztelan);
        monopolowy.wyswietlOferty();
        KoszykZakupowy koszMonopolowy = new KoszykZakupowy();
        monopolowy.zakupy(koszMonopolowy, Zubrowka, 10);
        koszMonopolowy.wyswietlZawartoscKoszyka();
        monopolowy.wyswietlOferty();
        String zmienna = String.valueOf(15245);
        System.out.println(zmienna);
        Klient daw = new KlientIndywidualny("Dawid","Lewandowski", 29);
        daw.wypisz();
        monopolowy.cosik();

    }

}