class Bestelling {
    private String naam;
    private double prijs;
    private Integer hoeveelheid = 0;
    private double totaal = 0.0;
    private Integer minimaleProduct;
    private String bedrijfNaam = "";
    private boolean toestemming;
    private Integer gewichtPakket;
    private boolean bezorgKosten;
    private double bezorgKostenPrijs = 0.0;

    public Bestelling(){
        this.minimaleProduct = 3;

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
        totaal += prijs;
        hoeveelheid++;

    }

    public double TotaalPrijs(){
        return totaal;
    }

    public boolean weigerBestelling(int hoeveelheid, String bedrijfNaam, boolean toestemming){
        return ((hoeveelheid < minimaleProduct) && (bedrijfNaam.isEmpty())) || (toestemming == false);
    }
}