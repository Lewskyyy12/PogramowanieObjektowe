public class CurrencyConverter implements Converter{
    private double valEuro;
    private double valUSD;
    public CurrencyConverter(double valEuro, double valUSD){
        this.valEuro = 4.75;
        this.valUSD = 4.20;
    }

    public double getValEuro() {
        return valEuro;
    }

    public double getValUSD() {
        return valUSD;
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