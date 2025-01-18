import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.Character.getType;

public class Counter<T> {
    ArrayList<T> tablica;
    Counter() {
        tablica = new ArrayList<>();
    }
    public void add(T element) {
        tablica.add(element);
    }
    public int getCount(){
        int counter = 0;
            for(T element : tablica){
                if(element instanceof Integer){
                    counter++;
                }
            }
        return counter;
    }
}

class TestCounter{
    public static void main(String[] args) {
        Counter<Object> counter = new Counter<>();
        counter.add(1);
        counter.add("Heheszek");
        counter.add(2);
        counter.add(2.43);
        System.out.println(counter.getCount());

    }
}