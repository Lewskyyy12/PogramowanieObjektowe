public class Platnosc {
    private String statusPlatnosci;
    private int kwota;

    public Platnosc(String statusPlatnosci, int kwota) {
        this.statusPlatnosci = statusPlatnosci;
        this.kwota = kwota;
    }
    public void  zaplac(){
        this.statusPlatnosci = "Oplacone";
        this.kwota = 0;
    }

    public String getStatusPlatnosci() {
        return statusPlatnosci;
    }
}
