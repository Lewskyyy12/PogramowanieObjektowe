public class Car extends Vehicle{
    private int numbersOfDoor;

    public Car(String brand, String model, int numbersOfDoor) {
        super(brand, model);
        this.numbersOfDoor = numbersOfDoor;
    }
}