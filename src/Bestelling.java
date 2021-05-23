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
        if(getHoeveelheid() < 3 && getHoeveelheid() == 0){
            prijs = 0.00;
        }
        else if (getHoeveelheid() < 3 && getHoeveelheid() > 0) {
            prijs = getHoeveelheid() * 10.25;
        }
        else if (getHoeveelheid() >= 3 && getHoeveelheid() <= 15) {
            prijs = getHoeveelheid() * 5.50;
        }
        else if (getHoeveelheid() >= 15) {
            prijs = getHoeveelheid() * 4.50;
        }
        return prijs;
    }

    public int getHoeveelheid(){
        return hoeveelheid;
    }

    public void addProduct(double prijs) {
        totaal += prijs;

        if (prijs == 0.00) {
            hoeveelheid += 0;
        } else {
            hoeveelheid++;
        }
    }

    public double TotaalPrijs(){
        return totaal;
    }

    public boolean weigerBestelling(int hoeveelheid, String bedrijfNaam, boolean toestemming){
        return ((bedrijfNaam.isEmpty() && toestemming) || ( hoeveelheid < minimaleProduct));
    }
}