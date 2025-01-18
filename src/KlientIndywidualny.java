public class KlientIndywidualny extends Klient{
    private static int PESEL;
    KlientIndywidualny(String imie, String nazwisko, int pesel){
        super(imie,nazwisko);
        this.PESEL = pesel;
    }
}
