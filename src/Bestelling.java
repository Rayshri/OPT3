class Bestelling {
    private String naam;
    private double prijs;
    private Integer hoeveelheid;
    private double totaal;

    public Bestelling(){

    }

    public String getNaam(){
        return naam;
    }

    public double getPrijs(){
        return prijs;
    }

    public int getHoeveelheid(){
        return hoeveelheid;
    }

    public void addProduct(double prijs){

    }

    public double TotaalPrijs(){
        return totaal;
    }
}