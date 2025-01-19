public class TemperatureSensor implements Sensor {
    private double value;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    public TemperatureSensor(double value){
        this.value = value;
    }
    @Override
    public double readValue(){
        return getValue();
    }
    @Override
    public String getStatus(){
        return "Ok";
    }
    @Override
    public void reset(){
        value = 0;
    }

}