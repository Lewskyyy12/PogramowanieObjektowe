import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Zestaw1
{
    public static void main(String[] args) {

        //zad1
        System.out.println("Zadanie 1");
        String imie = "Dawid";
        String nazwisko = "Lewandowski";
        System.out.println(imie);
        System.out.println(nazwisko);
        System.out.println();


        //zad2
        System.out.println("Zadanie 2");
        System.out.print(imie.length());
        System.out.print(" ");
        System.out.println(nazwisko.length());
        System.out.println();


        //zad3
        System.out.println("Zadanie 3");
        String Polacz = "Ala" + " ma" + " kota";
        System.out.println(Polacz);
        System.out.println();




        //zad4
        System.out.println("Zadanie 4");
        System.out.println("                    *");
        System.out.println("                    * *");
        System.out.println("                    * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * * *");
        System.out.println("* * * * * * * * * * * * * *");
        System.out.println("                    * * *");
        System.out.println("                    * *");
        System.out.println("                    *");


        System.out.println("     *");
        System.out.println("    * *");
        System.out.println("   * * *");
        System.out.println(" * * * * *");
        System.out.println("* * * * * *");
        System.out.println(" * * * * * ");
        System.out.println("  * * * * ");
        System.out.println("   * * * ");
        System.out.println("    * *");
        System.out.println("     *");
        System.out.println();


        //zad5
        System.out.println("Zadanie 5");
        String nPolacz = Polacz.replace('a','e');
        System.out.println(nPolacz);
        System.out.println();

        //zad6
        System.out.println("Zadanie 6");
        Polacz= Polacz.toLowerCase();
        System.out.println(Polacz);
        Polacz = Polacz.toUpperCase();
        System.out.println(Polacz);
        System.out.println();


        //zad7
        System.out.println("Zadanie 7");
        System.out.println("A " +(int)'A');
        System.out.println("! " +(int)'!');
        System.out.println("@ " +(int)'@');
        System.out.println("> " +(int)'>');
        System.out.println('n' +(int)'\n');
        System.out.println('b' +(int)'\b');
        System.out.println();

        //zad8
        System.out.println("Zadanie 8");
        System.out.println("male ->  97-122" );
        System.out.println("duze -> 65-90 " );
        System.out.println("cyfry -> 48-57" );
        System.out.println();


        //zad9
        System.out.println("Zadanie 9");
        String zdanie = "Grzesiek nie wiedział dlaczego ... jest tak drapieżnym ... mimo, że jego ... na to nie wskazuje.";
        zdanie = zdanie.replace("...","Orka");
        System.out.println(zdanie);
        System.out.println();




        //zad10
        System.out.println("Zadanie 10");
        System.out.printf("%s to najlepsza ksiazka napisana przez %s \n" ,"Cos tam cos", "Stephen'a Kinga");
        System.out.println();



        //zad11
        System.out.println("Zadanie 11");
        String wodrze = "wodrze";
        wodrze = wodrze.repeat(5);
        System.out.println(wodrze);
        System.out.println();


        //zad12
        System.out.println("Zadanie 12");
        Date d = new Date();
        SimpleDateFormat sd1 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat sd2 = new SimpleDateFormat("hh:mm:ss");
        System.out.printf("Dzisiaj jest %s godzina %s \n", sd1.format(d), sd2.format(d));
        System.out.println();



        //zad13
        System.out.println("Zadanie 13");
        System.out.println((char)54);
        System.out.println((char)103);
        System.out.println((char)241);
        System.out.println((char)67);
        System.out.println((char)9999);
        System.out.println((char)16);
        System.out.println((char)175045);

    }
}
