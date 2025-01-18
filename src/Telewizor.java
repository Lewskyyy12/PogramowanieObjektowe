public class Telewizor extends UrzadzenieElektroniczne{
    String marka;
    String model;
    int iloscCali;
    double cena;
    public Telewizor(String marka, String model, int iloscCali, double cena){
        this.marka = marka;
        this.model = model;
        this.iloscCali = iloscCali;
        this.cena = cena;

    }
    @Override
    public void napraw(){
        System.out.println("Naprawiono");
    }

    @Override
    public void uzyj() {
        System.out.println("Uzyj");
    }

    @Override
    public void wlacz() {
        System.out.println("Wlacz");
    }

    @Override
    public void zepsuj() {
        System.out.println("Zepsuj");
    }

    @Override
    public void wylacz() {
        System.out.println("Wylacz");

    }
}

class TelewizorTest{
    public static void main(String[] args) {
        Telewizor telewizor = new Telewizor("Marka","Model",100,0.5);
        telewizor.napraw();
        telewizor.wlacz();
    }
}