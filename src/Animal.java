
public class Animal {
    protected String name;
    protected int age;
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + "]";
    }
}
class Dog extends Animal {
    private String rasa;
    private String gender;

    public Dog(String name, int age, String rasa, String gender) {
        super(name, age);
        this.rasa = rasa;
        this.gender = gender;
    }

    public String getRasa() {
        return rasa;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Dog [name=" + name + ", rasa=" + rasa + "]";
    }
}

class Pair<T> {
    private T first;
    private T second;
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }
    public void setFirst(T first) {
        this.first = first;
    }
    public void setSecond(T second) {
        this.second = second;
    }
}

class TestAnimals {
    public static void main(String[] args) {
       Animal animal = new Animal("Alfred", 25);
       Animal dog = new Dog("Dog", 30, "Kielbasa","kobiet");
       var para = new Pair<Animal>(animal,dog);
       System.out.println(findMax(animal,dog).toString());
       System.out.println(findMaximum(para).toString());
       Dog[] dogs = new Dog[5];
       dogs[0] = new Dog("Dog", 30, "Kielbasa","kobiet");
       dogs[1] = new Dog("Dog1", 30, "Mleko","kobiet");
       dogs[2] = new Dog("Dog2", 30, "Piwko","kobiet");
       dogs[3] = new Dog("Dog3", 30, "Majonez","kobiet");
       dogs[4] = new Dog("Dog4", 30, "Jajko","kobiet");
       var wynik = new Pair<Animal>(dog,dogs[1]);
       findMinMaxRasa(dogs,wynik);
       System.out.println(wynik.getFirst().toString());
       System.out.println(wynik.getSecond().toString());
    }
    public static <T extends Animal> T findMax(T element1,T element2){
        if(element1.getAge()<element2.getAge()){
            return element2;
        }
        return element1;
    }
    public static<T> T findMaximum(Pair<? extends Animal> pair){
        if(pair.getFirst().getName().compareTo(pair.getSecond().getName())<0){
            return (T) pair.getFirst();
        }
        return (T) pair.getSecond();
    }
    public static<T extends Dog> void findMinMaxRasa(T[] tabik, Pair<? super Dog> result) {
        if(tabik == null || tabik.length == 0){
            return;
        }
        T max =tabik[0];
        T min = tabik[0];
        for(T t : tabik){
            if(max.getRasa().compareTo(t.getRasa()) < 0) max =t;
            if(min.getRasa().compareTo(t.getRasa()) > 0) min = t;
        }
        result.setFirst(max);
        result.setSecond(min);
    }
}