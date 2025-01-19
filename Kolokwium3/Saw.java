public class Saw extends WorkTool{
    public Saw(String name,int productionYear){
        this.name = name;
        this.productionYear = productionYear;
    }
    @Override
    public void use(){
        System.out.println("Wrr");
    }
}
