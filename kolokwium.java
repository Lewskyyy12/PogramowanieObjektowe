//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static int podciag(int[] tab){
        int dlugosc=1;
        for(int i=0;i<tab.length;i++){
            int licznik=1;
            int poprzednia = tab[i];
            for(int j=i+1;j<tab.length-1;j++){
                if(tab[j]>poprzednia){
                    licznik++;
                    poprzednia=tab[j];
                }

            }
            if(licznik>dlugosc) dlugosc=licznik;
        }

        return dlugosc;
    }

    public static int podciag(int[] tab, int r){
        int dlugosc=0;
        int poprz=tab[0];
        int pom=0;
        for(int i=1;i<tab.length;i++){
            if(tab[i]== poprz + r){
                pom++;
            }
            else {
                if(dlugosc<pom) dlugosc = pom;
                pom=0;
            }
            poprz= tab[i];
        }
        return dlugosc +1;
    }
    public static void sekwencjaCollatza(int n, int c){
        System.out.print(c + " ");
        for(int i=0;i<n-1;i++) {
            if (c % 2 == 0) {
                c=(int) c/2;
                System.out.print(c + " ");
            }
            else {
                c=c*3+1;
                System.out.print(c + " ");

            }
        }
        System.out.println();
    }
    public static void minMaxSekwencjaCollatza(int n, int c){
        int[] tab=new int[n];
        tab[0] = c;
        int min=tab[0];
        int max=tab[0];
        for(int i=1;i<n;i++) {
            if (c % 2 == 0) {
                tab[i]= c/2;
                c=tab[i];
            }
            else {
                tab[i]=c*3+1;
                c=tab[i];
            }
            if(tab[i]<min) min=tab[i];
            if(tab[i]>max) max=tab[i];
        }
        System.out.println("min="+min);
        System.out.println("max="+max);


    }
    public static Boolean czyCiagArytmetyczny(int[] tab){
        int r = tab[1] - tab[0];
        for(int i=1;i<tab.length;i++){
            if(tab[i]!=tab[i-1] + r) return false;
        }
        return true;
    }
    public static Boolean czyCiagArytmetycznyRodzajuM(int[] tab, int m){

        for(int i=1;i<m;i++){
            for(int j=0;j<tab.length-i;j++){
                tab[j]=tab[j+1]-tab[j];
            }
        }
        int r = tab[1] - tab[0];
        for(int i=1;i<tab.length-m-1;i++){
           if(tab[i]!=tab[i-1]+r) return false;
        }
        return true;
    }



    public static void main(String[] args) {
       int[] tab = new int[]{5,1,1,4,3};
        System.out.println(podciag(tab));
        System.out.println(podciag(tab, 1));
        sekwencjaCollatza(10, 6);
        minMaxSekwencjaCollatza(10,6);
        System.out.println(czyCiagArytmetyczny(tab));
        System.out.println(czyCiagArytmetycznyRodzajuM(tab, 3));
    }
}