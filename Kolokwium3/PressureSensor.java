public class PressureSensor implements Sensor{
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