public class Hammer extends  WorkTool{
    public Hammer(String name, int productionYear){
        this.name=name;
        this.productionYear=productionYear;
    }
    @Override
    public void use(){
        System.out.println("Bum");
    }
}