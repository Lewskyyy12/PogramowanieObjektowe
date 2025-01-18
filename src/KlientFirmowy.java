public class KlientFirmowy extends Klient{
    private static int NIP;
    private static int REGON;
    KlientFirmowy(String imie, String nazwisko, int NiP, int REGON ) {
        super(imie, nazwisko);
        this.NIP = NiP;
        this.REGON = REGON;
    }
}
