import java.util.Scanner;

public class Zestaw2 {
    public static void main(String[] args) {
       //zad1
        System.out.println("Zadanie 1");
        System.out.println(23.0+76) ; //double;
        System.out.println(41*2.0+3); // double
        System.out.println(5-33); //int
        System.out.println(109%3);//int
        System.out.println(50/2);//int
        System.out.println(4|2);//int
        System.out.println(3^5);//int
        System.out.println(7&9);//int
        System.out.println();

        //zad2
        System.out.println("Zadanie 2");
        System.out.println((int)((Math.sqrt(7)-1)/2+(Math.pow(3,3)%2)));
        System.out.println((int)(1997/(3*9)));
        System.out.println((int)((3+ Math.sqrt(3))/((Math.sqrt(5)/2)/3)+1));
        int a = 2001;
        int b=5;
        int c=2;
        System.out.println((int)(a%b%c));
        System.out.println((int)(11%5+1/Math.pow(2,(1/4))));
        System.out.println();

        //zad3
        System.out.println("Zadanie 3");
        Scanner scan = new Scanner(System.in);
        String text1 = scan.nextLine();
        String text2 = scan.nextLine();
        System.out.printf("%s %s \n",text1 , text2);
        System.out.println();

        //zad4
        System.out.println("Zadanie 4");
        System.out.println("Podaj pierwsza");
        int l1 = scan.nextInt();
        System.out.println("Podaj druga");
        int l2 = scan.nextInt();
        System.out.printf("Suma = %d \n", l1+l2);
        System.out.printf("Roznica = %d \n" ,l1-l2);
        System.out.printf("Iloczyn = %d \n",l1*l2 );
        System.out.printf("Iloraz = %d \n",l1/l2);
        System.out.println();


        //zad5
        System.out.println("Zadanie 5");
        int x = scan.nextInt();
        System.out.println(x+140);
        System.out.println(x-31);
        System.out.println(x*7);
        System.out.println(x/13);
        System.out.println(x%7);
        System.out.println(x/14);
        System.out.println(Math.pow(x,45));
        System.out.println(Integer.toBinaryString(x | 67));
        System.out.println(x & 59);
        System.out.println(x ^ 23);
        System.out.println(x<<5);
        System.out.println(x>>6);

    }
}
