
public class Main {
    public static void main(String[] args) {
       String pierwsza = "pierwsza";
       String druga = "druga";
       System.out.println(isEqualOrNull(pierwsza,druga));
    }
    static <T extends Comparable<T>> Boolean isEqualOrNull(T element1, T element2){
        if(element1 == null && element2 == null || element1.compareTo(element2)== 0) return true;
            return false;
    }
}