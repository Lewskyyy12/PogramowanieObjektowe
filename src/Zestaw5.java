import java.util.ArrayList;
import java.util.Collections;

public class Zestaw5 {
    public static void wypisz(ArrayList<Integer> tab1) {
        for (int i = 0; i < tab1.size(); i++) {System.out.println(tab1.get(i));}
    }

    public static void append(ArrayList<Integer> tab1, ArrayList<Integer> tab2) {
        tab1.addAll(tab2);
    }

    public static void merge(ArrayList<Integer> tab1, ArrayList<Integer> tab2)
    {
        ArrayList<Integer> tab3 = new ArrayList<>();
        int i= 0, j=0;
        while(i+j<tab1.size()+tab2.size()){
            if(i< tab1.size()) {
                tab3.add(tab1.get(i));
                i++;
            }
            if(j< tab2.size()) {
                tab3.add(tab2.get(j));
                j++;
            }
        }
        wypisz(tab3);
    }
    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> tab1, ArrayList<Integer> tab2){
        ArrayList<Integer> tab3 = new ArrayList<>();
        Collections.sort(tab1, (a, b) -> a.compareTo(b));
        Collections.sort(tab2, (a, b) -> a.compareTo(b));
        int i =0, j=0;
        for(int z=0;z<tab1.size()+tab2.size()+1;z++){
            int x = tab1.get(i), y = tab2.get(j);
            if(x <= y && j<tab2.size() && i<tab1.size()) {
                tab3.add(x);
                if(i == tab1.size() -1) break;
                i++;
            }
            else if(y < x && i<tab1.size() && i<tab1.size()) {
                tab3.add(y);
                if(j == tab2.size() -1) break;
                j++;
            }
        }
        if(i<tab1.size()) {
            while(i<tab1.size()) {
                tab3.add(tab1.get(i));
                i++;
            }
        }
        if(j<tab2.size()) {
            while(j<tab2.size()) {
                tab3.add(tab2.get(j));
                j++;
            }
        }
        return tab3;
    }

    public static ArrayList<String> toArraylist(String napis){
        ArrayList<String> arraylist = new ArrayList<>();
        for(int i=0; i<napis.length(); i++){
            char c = napis.charAt(i);
            arraylist.add(c+"");
        }
        Collections.sort(arraylist);
        return arraylist;
    }

    public static ArrayList<Integer> toArraylist(int liczba){
        ArrayList<Integer> arraylist = new ArrayList<>();
        String liczbus = liczba+"";
        for(int i=0; i<liczbus.length(); i++){
            char c = liczbus.charAt(i);
            arraylist.add((int) c -48);
        }
        Collections.sort(arraylist);
        return arraylist;
    }

    public static boolean checkChar(ArrayList<String> tab1, char znak){
        for(int i=0; i<tab1.size(); i++) {
            if(tab1.get(i).charAt(0)== znak ) return true;
        }
        return false;
    }

    public static boolean checkDigit(ArrayList<Integer> tab1, int liczba){
        for(int i=0;i<tab1.size();i++){
            if(tab1.get(i)==liczba) return true;
        }

        return false;
    }

    public static int countChar(ArrayList<String> tab1, char znak){
       int counter=0;
       for(int i=0; i<tab1.size();i++){
           if(tab1.get(i).charAt(0)==znak) counter++;
       }
       return counter;
    }

    public static int countDigit(ArrayList<Integer> tab1, int liczba){
        int counter=0;
        for(int i=0; i<tab1.size();i++){
            if(tab1.get(i)==liczba) counter++;
        }
        return counter;
    };

    public static void uniqueArrayList(ArrayList<String> tab){
        ArrayList<String> tab2 = new ArrayList<>();
        ArrayList<Integer> tab4 = new ArrayList<>();
        tab2.add(tab.get(0));
        tab4.add(1);
        for(int i=0; i<tab.size(); i++){
            boolean czYdodaj = true;
            for(int j=0;j<tab2.size();j++){
                if(tab.get(i).charAt(0)==tab2.get(j).charAt(0)) {
                    int set = tab4.get(j) + 1;
                    System.out.println(set);
                    tab4.set(j, set);
                    czYdodaj = false;
                    break;
                }
            }
            if(czYdodaj== true){
                tab2.add(tab.get(i));
                tab4.add(1);
                czYdodaj = false;
            }
        }

        ArrayList<ArrayList<String>> tab3 = new ArrayList<>();
        for(int i=0; i<tab2.size(); i++){
            ArrayList<String> wielowymiar = new ArrayList<>();
            wielowymiar.add(tab2.get(i));
            wielowymiar.add(tab4.get(i)+"");
            tab3.add(wielowymiar);

        }
        System.out.println(tab2);
        System.out.println(tab3);
    }

    public static void main(String[] args) {
            ArrayList<Integer> tab1 = new ArrayList<>();
            ArrayList<Integer> tab2 = new ArrayList<>();
            tab1.add(1);
            tab1.add(5);
            tab1.add(4);
            tab2.add(10);
            tab2.add(8);
            tab2.add(9);
            tab2.add(20);
            tab2.add(11);
            tab1.add(45);
            tab2.add(13);
            tab2.add(1);
            tab2.add(46);
            tab2.add(46);
            //append(tab1, tab2);
            //merge(tab1, tab2);
            // ArrayList<Integer> tab3 = new ArrayList<>();
            // tab3 = mergeSorted(tab1, tab2);
            // wypisz(tab3);
            String napis = "Ala ma kota";
            int liczba = 12548897;
            ArrayList<Integer> tab4 = toArraylist(liczba);
            ArrayList<String> tab5 = toArraylist(napis);
            System.out.println(tab4);
            System.out.println(tab5);
            System.out.println(checkChar(tab5,'c'));
            System.out.println(countChar(tab5,'a'));
            System.out.println(checkDigit(tab4, 5));
            System.out.println(countDigit(tab4, 0));
            uniqueArrayList(tab5);


    }
}
