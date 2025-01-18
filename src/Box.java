import java.util.List;

public class Box<T> {
    private T data;
    public Box(T data) {
        this.data = data;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public boolean isEqual(Box<T> box) {
        return this.data.equals(box.getData());
    }

}

class TestBox {
    public static void main(String[] args) {
        Box<String> boksik = new Box<String>("Miesiana miesiana");
        Box<String> pita = new Box<String>("Miesiana miesiana");
        Box<Integer> ilos = new Box<Integer>(25);
        System.out.println(pita.getData());
        System.out.println(boksik.isEqual(pita));
        System.out.println(ilos.getData());
        Integer[] tablica = new Integer[5];
        tablica[0] = 1;
        tablica[1] = 2;
        tablica[2] = 3;
        tablica[3] = 4;
        tablica[4] = 5;
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
        swap(tablica, 1, 4);
        System.out.println("\n Po zmianie \n");

        for (Integer i : tablica) {
            System.out.println(i);
        }
        System.out.println("\n" +minValue(tablica));
    }
    public static <T> void swap(T[] array, int a, int b){
        if(b<array.length && a<array.length && a>=0 && b>=0){
            T temp = array[a];
            array[a] = array[b];
            array[b] = temp;
        }
    }
    public static <T extends Comparable<T>> T minValue(T... array){
        T min = array[0];
        for(T t : array){
            if(min.compareTo(t) > 0){
                min = t;
            }
        }
        return min;
    }
}