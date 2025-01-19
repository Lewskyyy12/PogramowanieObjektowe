public abstract class WorkTool {
    String name;
    int productionYear;
    abstract void use();
}
class Hammer extends  WorkTool{
    public Hammer(String name, int productionYear){
        this.name=name;
        this.productionYear=productionYear;
    }
    @Override
    public void use(){
        System.out.println("Bum");
    }
}
class Screwdriver extends WorkTool{
    public Screwdriver(String name,int productionYear){
        this.name=name;
        this.productionYear=productionYear;
    }
    @Override
    public void use(){
        System.out.println("Brr");
    }
}
class Saw extends WorkTool{
    public Saw(String name,int productionYear){
        this.name = name;
        this.productionYear = productionYear;
    }
    @Override
    public void use(){
        System.out.println("Wrr");
    }
}
