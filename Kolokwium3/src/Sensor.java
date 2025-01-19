public interface Sensor {
    abstract double readValue();
    abstract String getStatus();
    abstract void  reset();
}
class TemperatureSensor implements Sensor{
    private double value;

    public double getValue() {
        return value;
    }
    public void setValue(double value){
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
class PressureSensor implements Sensor{
    private double value;

    public double getValue() {
        return value;
    }
    public void setValue(double value){
        this.value = value;
    }
    @Override
    public double readValue(){
        return value;
    }
    @Override
    public String getStatus(){
        return "Ok2";
    }
    @Override
    public void reset(){
        value = 0;
    }
}