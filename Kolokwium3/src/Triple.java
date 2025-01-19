public class Triple<T> {
    T first;
    T second;
    T third;

    public Triple(T first, T second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    public T getFirst(){
        return first;
    }
    public T getSecond(){
        return second;
    }
    public T getThird(){
        return  third;
    }
}
