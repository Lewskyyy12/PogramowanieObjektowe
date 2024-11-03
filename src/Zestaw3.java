import javax.swing.*;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.lang.String;

public class Zestaw3 {

    public static void trojkiPitagorejskie(int n) {
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n; k++) {
                    if (pow(i, 2) + pow(j, 2) == pow(k, 2) && i+j+k<=n) System.out.printf("%d^2 + %d^j = %d^2 \n" ,i,j,k);
                }
            }
        }
    }


    public static void funKwaRozwiazania(int n){

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                            double delta= j^2 - 4*i*k;
                            if(i+j+k<=n && delta>0) System.out.printf("%d -> a  %d -> b %d -> c \n", i, j, k);
                    }
                }
            }
    }

    public  static void funKwaDelta(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    double delta= pow(j,2) - 4*i*k;
                    if(i+j+k<=n && delta>0 && sqrt(delta)%2==0) {
                        System.out.printf("a <-%d b<- %d c<-%d  \n", i, j, k);
                    }
                }
            }
        }
    }
    public static void liczbyPierwsze(int n){
        for(int i=2; i < n+1;i++){
            int sprawdz = 1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    sprawdz = 0;
                    break;
                }
            }
            if(sprawdz==1) System.out.printf("%d \n", i);
            sprawdz=0;
        }
    }

    public static void liczbyPodzielne(int m, int n){
        long pocz =1;
        long kon=9;
        for(int i=1;i<m;i++){
            kon=kon*10+9;
            pocz=pocz*10;
        }
        for(;pocz<=kon;pocz++){
            if(pocz%n==0) System.out.printf("%d ", pocz);
        }
    }

    public static void piramida(int n, int variant){
        if(variant==1) {
            for (int x = 0; x < n; x++) {
                for(int y=0;y<n-x;y++) System.out.print(" ");
                for(int z=0;z<x*2+1;z++) System.out.print("*");
                System.out.println();
            }
        }
        else {
            for(int i=0;i<n;i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

//    public static int silnia(int n){
//        if(n==1) return 1;
//        return n*silnia(n-1);
//    }

    public static int silnia(int n){
        int wynik = 1;
        if(n==0) return wynik;
        while(n>0) {
            wynik = wynik * n;
            n--;
        }
        return wynik;
    }

    public static int silniaPodwojna(int n){
        int wynik = 1;
        if(n==0) return wynik;
            while(n>0) {
                wynik = wynik * n;
                n = n - 2;
            }
        return wynik;
    }
    public static int silnia(int m, int n){
        int wynik = 1;
        if(n==0) return wynik;
        while(n>0) {
            wynik = wynik * n;
            n = n - m;
        }
        return wynik;
    }

    public static int dwumianNewtona(int n, int k){

        return (silnia(n)/(silnia(k)*silnia(n-k)));
    }

    public static void ciagFibonacciego(int n) {
        int pop =0;
        int teraz =1;
        int wynik = 0;
        while(n>0){
            System.out.print(wynik+ " ");
            wynik = teraz+ pop;
            pop=teraz;
            teraz = wynik;
            n--;
        }
        System.out.println();
    }
    public static void sumaNaturalnych(int n){
        int suma=0;
        for(int i=1;i<=n;i++){
            suma=suma+i;
        }
        System.out.println(suma);
    }
    public static void sumaParzystych(int n){
        int suma=0;
        for(int i=1;i<=n;i++){
            if(i%2==0) suma=suma+i;
        }
        System.out.println(suma);
    }
    public static void sumaNieparzystych(int n){
        int suma=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0) suma=suma+i;
        }
        System.out.println(suma);
    }
    public static void sumaKwaNaturalnych(int n){
        int suma=0;
        for(int i=1;i<=n;i++){
            suma=suma+i*i;
        }
        System.out.println(suma);
    }
    public static void sumaSzeNaturalnych(int n){
        int suma=0;
        for(int i=1;i<=n;i++){
            suma += (pow(i,3));
        }
        System.out.println(suma);
    }
    public static void sumaOdwNaturalnych(int n){
        double suma=0.0;
        for(int i=1;i<=n;i++){
            suma+= (double) (1/i);
        }
        System.out.println(suma);
    }
public static void obliczSumy(int n){
        sumaNaturalnych(n);
        sumaParzystych(n);
        sumaNieparzystych(n);
        sumaKwaNaturalnych(n);
        sumaSzeNaturalnych(n);
        sumaOdwNaturalnych(n);
}

public static boolean czyPalindrom(String wyraz){
        for(int i=0;i<wyraz.length();i++){
            if(wyraz.charAt(i)!=wyraz.charAt(wyraz.length()-1-i)) return false;
        }
        return true;
}

    public static void trojkatPascala(int n) {
        for (int x = 0; x < n; x++) {
            if(x<5) System.out.print(" ");
            if(n<10 && x<9) System.out.print(" ");
            for(int y=0;y<n-x;y++) System.out.print(" ");
            for(int z=0;z<x+1;z++) System.out.print(" " +dwumianNewtona(x,z));
            System.out.println();
        }
    }

    public static boolean czyPalindrom2(int n){
        String czyPal = n + "";
        return czyPalindrom(czyPal);
    }

    public static boolean czyDoskonala(int n){
        int suma=0;
        for(int i=1;i<n;i++){
            if(n%i==0) suma=suma+i;
        }
        if(suma==n) return true;
        else return false;
    }
    public static boolean czyPierwsza(int n){
        if(n==0 || n==1) return false;
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static int NWD(int a, int b){
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        int temp = b;
        while(a%temp!=0){
            do {
                temp--;
            }while(b%temp!=0);
        }
        return temp;
    }
    public static void wczytajTablice(int n){
        Scanner scan = new Scanner(System.in);
        int[] tab = new int[n];
        for(int i=0;i<n;i++) tab[i]= scan.nextInt();
        for(int i=0;i<n;i++) System.out.printf("%d ",tab[i]);

    }

    public static void podzbiory(int[] tab){
       //jakis kodzik
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //zad1
//        int i  = sc.nextInt();
//        trojkiPitagorejskie(i);
//        System.out.println();

//        //zad2
//        int n = sc.nextInt();
//        funKwaRozwiazania(n);
//        System.out.println();

//        //zad3
//        int n2 = sc.nextInt();
//        funKwaDelta(n2);
//        System.out.println();

        //zad4
//        int n3 = sc.nextInt();
//        liczbyPierwsze(n3);
//        System.out.println();

        //zad5
//        int m= sc.nextInt();
//        int n4 =sc.nextInt();
//        liczbyPodzielne(m,n4);
//        System.out.println();

//        //zad6
//        int n5 = sc.nextInt();
//        int variant = sc.nextInt();
//        piramida(n5,variant);
//        System.out.println();

//        //zad7
//        int n = sc.nextInt();
//        System.out.println(silnia(n));
//        System.out.println();

//        //zad8
//        int n = sc.nextInt();
//        System.out.println(silniaPodwojna(n));
//        System.out.println();

//        //zad9
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        System.out.println(silnia(m,n));
//        System.out.println();

//        //zad10
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        System.out.println(dwumianNewtona(n,k));
//        System.out.println();

        //zad11
//        int n = sc.nextInt();
//        ciagFibonacciego(n);

//        //zad12
//        int n = sc.nextInt();
//        obliczSumy(n);

//        //zad13
//        String wyraz = sc.nextLine();
//        System.out.println(czyPalindrom(wyraz));

        //zad14
        int n = sc.nextInt();
        trojkatPascala(n);

//        //zad15
//        int n = sc.nextInt();
//        System.out.println(czyPalindrom2(n));

//        //zad16
//        int n = sc.nextInt();
//        System.out.println(czyDoskonala(n));

//        //zad17
//        int n = sc.nextInt();
//        System.out.println(czyPierwsza(n));

//        //zad18
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        System.out.println(NWD(a,b));

//        //zad19
//        int n =sc.nextInt();
//        wczytajTablice(n);

//        //zad20
//        int n =sc.nextInt();
//        int[] tab = new int[n];
//        for(int i=0;i<n;i++) tab[i] = sc.nextInt();
//        podzbiory(tab);






    }
}
