public class Vehicle {
    protected String brand;
    protected String model;
    public Vehicle(String brand, String model){
        this.brand =brand;
        this.model = model;
    }
}
class Car extends Vehicle{
    private int numbersOfDoor;

    public Car(String brand, String model, int numbersOfDoor) {
        super(brand, model);
        this.numbersOfDoor = numbersOfDoor;
    }
}
