class UnitConverter implements Converter{
    private double valEuro;
    private double valUSD;
    public UnitConverter(double valEuro, double valUSD){
        this.valEuro = 4.55;
        this.valUSD = 4.12;
    }
    @Override
    public double convertToEuro(double amount){
        return amount*valEuro;
    }
    @Override
    public double convertToUSD(double amount){
        return amount*valUSD;
    }
    @Override
    public double getConversionRate(String currency){
        if(currency.equals("Euro")) return valEuro;
        else if (currency.equals("USD")) return valUSD;
        else return 0;
    }
}