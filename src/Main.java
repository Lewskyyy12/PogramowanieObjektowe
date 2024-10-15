import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //zad1
        String imie = "Dawid";
        String nazwisko = "Lewandowski";
        System.out.println(imie);
        System.out.println(nazwisko);
        //zad2
        System.out.print(imie.length());
        System.out.print(" ");
        System.out.println(nazwisko.length());
        //zad3


        String Polacz = "Ala" + " ma" + " kota";
        System.out.println(Polacz);
        //zad4


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

        //zad5

        String nPolacz = Polacz.replace('a','e');
        System.out.println(nPolacz);

        //zad6
        Polacz= Polacz.toLowerCase();
        System.out.println(Polacz);
        Polacz = Polacz.toUpperCase();
        System.out.println(Polacz);
        //zad7
        System.out.println("A " +(int)'A');
        System.out.println("! " +(int)'!');
        System.out.println("@ " +(int)'@');
        System.out.println("> " +(int)'>');
        System.out.println('n' +(int)'\n');
        System.out.println('b' +(int)'\b');
        //zad8
        System.out.println("male ->  97-122" );
        System.out.println("duze -> 65-90 " );
        System.out.println("cyfry -> 48-57" );
        //zad9
        String zdanie = "Grzesiek nie wiedział dlaczego ... jest tak drapieżnym ... mimo, że jego ... na to nie wskazuje.";
        zdanie = zdanie.replace("...","Orka");
        System.out.println(zdanie);
        //zad10
        System.out.printf("%s to najlepsza ksiazka napisana przez %s \n" ,"Cos tam cos", "Stephen'a Kinga");
        //zad11
        String wodrze = "wodrze";
        wodrze = wodrze.repeat(5);
        System.out.println(wodrze);
        //zad12
        System.out.println("Dzisiaj jest () godzina ()");
        //zad13

        System.out.println((char)54);
        System.out.println((char)103);
        System.out.println((char)241);
        System.out.println((char)67);
        System.out.println((char)9999);
        System.out.println((char)16);
        System.out.println((char)175045);



        //Cwicznie 2 zad1
        System.out.println(23.0+76) ; //double;
        System.out.println(41*2.0+3); // double
        System.out.println(5-33); //int
        System.out.println(109%3);//int
        System.out.println(50/2);//int
        System.out.println(4|2);//int
        System.out.println(3^5);//int
        System.out.println(7&9);//int
        //zad2
        System.out.println((int)((Math.sqrt(7)-1)/2+(Math.pow(3,3)%2)));
        System.out.println((int)(1997/(3*9)));
        System.out.println((int)((3+ Math.sqrt(3))/((Math.sqrt(5)/2)/3)+1));
        int a = 2001;
        int b=5;
        int c=2;
        System.out.println((int)(a%b%c));
        System.out.println((int)(11%5+1/Math.pow(2,(1/4))));
        //zad3
        Scanner scan = new Scanner(System.in);
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        System.out.printf("%s %s \n",text1 , text2);
        //zad4
        System.out.println("Podaj pierwsza");
        int l1 = scan.nextInt();
        System.out.println("Podaj druga");
        int l2 = scan.nextInt();
        System.out.printf("Suma = %d \n", l1+l2);
        System.out.printf("Roznica = %d \n" ,l1-l2);
        System.out.printf("Iloczyn = %d \n",l1*l2 );
        System.out.printf("Iloraz = %d \n",l1/l2);
        //zad5

        int x = scan.nextInt();
        System.out.println(x+140);
        System.out.println(x-31);
        System.out.println(x*7);
        System.out.println(x/13);
        System.out.println(x%7);
        System.out.println();
        System.out.println(Math.pow(x,45));


    }
}