import java.util.Scanner;
import java.util.Random;

public class Zestaw4 {

    static void wypiszTablice( int[] tab, int n, int m) {
        int a = 0;
        while (a < tab.length) {
            for (int k = 0; k < m; k++) {
                for (int j = 0; j < n; j++) {
                    if(a<=tab.length-1) System.out.print(tab[a++] + " ");
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
    static void ileNieparzystych(int[] tab){
        int suma = 0;
        for(int i=0;i<tab.length;i++) if(tab[i]%2!=0) suma++;
        System.out.println("Nieparzystych -> " + suma);
    }
    static void ileParzystych(int[] tab) {
        int suma = 0;
        for(int i=0;i<tab.length;i++) if(tab[i]%2==0) suma++;
        System.out.println("Parzystych -> " + suma);
    }
    static void ileDodatnich(int[] tab) {
        int suma = 0;
        for(int i=0;i<tab.length;i++) if(tab[i]>0) suma++;
        System.out.println("Dodatnich -> " + suma);
    }
    static void ileUjemnych(int[] tab){
        int suma = 0;
        for(int i=0;i<tab.length;i++) if(tab[i]<0) suma++;
        System.out.println("Ujemnych -> " + suma);
    }
    static void ileZerowych(int[] tab){
        int suma = 0;
        for(int i=0;i<tab.length;i++) if(tab[i]==0) suma++;
        System.out.println("Zerowych -> " + suma);
    }
    static void ileMaxymalnych(int[] tab){
        int Max = tab[0];
        int licznik = 1;
        for(int i=1;i<tab.length;i++){
            if(tab[i]>Max){
                Max = tab[i];
                licznik=1;
            }
            else if(tab[i]==Max) licznik++;
        }
        System.out.println("Ilosc maxymalnych " +Max+ "-> " + licznik);
    }
    static void ileMinimalnych(int[] tab){
        int Min = tab[0];
        int licznik = 1;
        for(int i=1;i<tab.length;i++){
            if(tab[i]<Min){
                Min = tab[i];
                licznik=1;
            }
            else if(tab[i]==Min) licznik++;
        }
        System.out.println("Ilosc minimalnych " +Min+ "-> " + licznik);
    }
    static void ileUnikalnych(int[] tab){
        boolean pom[] =new boolean[tab.length];
        for(int i=0;i<tab.length;i++) pom[i] = true;
        for(int i=0;i<tab.length;i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (i == j) continue;
                if (tab[i] == tab[j]) {
                    pom[i] = false;
                    break;
                }
            }
        }
        int zlicz=0;
        for(int i=0;i<tab.length;i++) if(pom[i] == true) zlicz++;
        System.out.println("Unikalnych ->"+ zlicz);

    }

    static void sumaDodatnich(int[] tab){
        int suma = 0;
        for(int i=0;i<tab.length;i++) if(tab[i]>0) suma+=tab[i];
        System.out.println("Suma dodatnich -> " + suma);
    }
    static void sumaUjemnych(int[] tab){
        int suma = 0;
        for(int i=0;i<tab.length;i++) if(tab[i]<0) suma+=tab[i];
        System.out.println("Suma ujemnych -> " + suma);
    }
    static void sumaOdwrotnosci(int[] tab){
        double suma = 0;
        for(int i=0;i<tab.length;i++) suma += (double) 1/tab[i];
        System.out.println("Suma Odwrotnosci -> " + suma);
    }
    static void sredniaArytmetyczna(int[] tab){
        int suma = 0;
        for(int i=0;i<tab.length;i++)  suma= suma + tab[i];
        double wynik = (double) suma/ tab.length;
        System.out.println("Srednia Arytmetyczna -> " + wynik);
    }
    static void sredniaGeometryczna(int[] tab){
        int suma = 1;
        for(int i=0;i<tab.length;i++)  suma=suma *tab[i];
        double wynik = (double) (Math.pow(suma,(double)(1.0/tab.length)));
        System.out.println("Srednia geometryczna -> " + wynik);
    }
    static void sredniaHarmoniczna(int[] tab){
        double mianownik = 0;
        for( int i=0;i<tab.length;i++){
            mianownik = (double) 1/tab[i];
        }
        System.out.println("Srednia harmoniczna -> " + tab.length/mianownik);
    }
    static void funkcjaLiniowa(int[] tab, int a, int b){
        for(int i=0;i<tab.length;i++) System.out.print(a*tab[i]+b + " ");
        System.out.println();
    }
    static void funkcjaKwadratowa(int[] tab,int a,int b,int c){
        for(int i=0;i<tab.length;i++) System.out.print(a*Math.pow(tab[i],2.0)+b*tab[i]+c + " ");
        System.out.println();
    }
    static void funkcjaWykladnicza(int[] tab,int a){
        for(int i=0;i<tab.length;i++) System.out.print(Math.pow(a,tab[i]) + " ");
        System.out.println();
    }
    static void funkcjaSignum(int[] tab){

    }
    static void  najdluzszyCiagDodatnich(int[] tab){

    }
    static void najdluzszyCiagUjemnych(int[] tab){

    }
    static void odwrocTablice(int[] tab){

    }
    static void odwrocTablice(int[] tab,int indeksStart,int indeksStop){
        for(int i=0;i<=indeksStop-indeksStart;i++){
            int pom = tab[indeksStart+i];
            tab[i]=tab[indeksStop-i];
            tab[indeksStop-i]=pom;
        }
        wypiszTablice(tab,2,4);
    }

    static void generujTablice(int n, int minWartosc, int maxWartosc){
        Random rand = new Random();
        int[] tab = new int[n];
        for(int i=0;i<n;i++){
            tab[i] = (int)(Math.random()* (maxWartosc-minWartosc+1)+ minWartosc);
        }
        wypiszTablice(tab,2,4);
        odwrocTablice(tab, 2, 5);
        ileNieparzystych(tab);
        ileParzystych(tab);
        ileDodatnich(tab);
        ileUjemnych(tab);
        ileZerowych(tab);
        ileMaxymalnych(tab);
        ileMinimalnych(tab);
        ileUnikalnych(tab);
        sumaDodatnich(tab);
        sumaUjemnych(tab);
        sumaOdwrotnosci(tab);
        sredniaArytmetyczna(tab);
        sredniaGeometryczna(tab);
        sredniaHarmoniczna(tab);
        funkcjaLiniowa(tab, 2, 5);
        funkcjaKwadratowa(tab, 2, 3, 4);
        funkcjaWykladnicza(tab, 2) ;
        funkcjaSignum(tab);
        najdluzszyCiagDodatnich(tab);
        najdluzszyCiagUjemnych(tab);
        odwrocTablice(tab);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //zad1
        int n = scan.nextInt();
        generujTablice(n,-20,20);


    }
}
