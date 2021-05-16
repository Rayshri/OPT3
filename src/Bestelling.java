class Bestelling {
    private String naam;
    private double prijs;
    private String datum;
    private Integer hoeveelheid = 0;
    private double totaal = 0.0;
    private Integer minimaleProduct = 3;
    private String bedrijfNaam = "";
    private boolean toestemming;
    private Integer gewichtPakket;
    private boolean bezorgKosten;
    private double bezorgKostenPrijs = 0.0;
    private Medewerker medewerker;


    public Bestelling(String datum, String naam, double prijs, Integer hoeveelheid, Medewerker medewerkerNaam){
        this.datum = datum;
        this.naam = naam;
        this.prijs = prijs;
        this.hoeveelheid = hoeveelheid;
        this.medewerker = medewerkerNaam;
        // new Medewerker(medewerkerNaam, 1234, "Interieursonderhouder");
    }

    public String getNaam(){
        return naam;
    }

    public double getPrijs(){
        if (getHoeveelheid() < 3 && getHoeveelheid() > 0) {
            prijs = getHoeveelheid() * 10.25;
        }
        else if (getHoeveelheid() >= 3 && getHoeveelheid() < 15) {
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

    public void addProduct(double prijs){
        totaal += prijs;
        hoeveelheid++;
    }

    public String getDatum(){
        return datum;
    }

    public String getBedrijfNaam(){
        return bedrijfNaam;
    }

    public Integer getGewichtPakket(){
        return gewichtPakket;
    }

    public double TotaalPrijs(){
        return totaal;
    }

    public boolean weigerBestelling(int hoeveelheid, String bedrijfNaam, boolean toestemming){
        return ((hoeveelheid < minimaleProduct) && (bedrijfNaam.isEmpty())) || (toestemming == false);
    }

    public double getBezorgKosten(int hoeveelheid, boolean toestemming, int gewichtPakket, boolean bezorgKosten) {
        if((hoeveelheid > 0 && hoeveelheid <= 4) && (toestemming == true) && (gewichtPakket > 0 && gewichtPakket < 25) && (bezorgKosten == true)){
            bezorgKostenPrijs = 7.50;
        }
        else if((hoeveelheid > 0 && hoeveelheid <= 4) && (toestemming == false) && (gewichtPakket > 0 && gewichtPakket < 25) && (bezorgKosten == false)){
            bezorgKostenPrijs = 0.0;
        }
        else if((hoeveelheid <= 5 && hoeveelheid <= 15) && (toestemming == true) && (gewichtPakket > 0 && gewichtPakket < 25) && (bezorgKosten == true)) {
            bezorgKostenPrijs = 8.50;
        }
        else if((hoeveelheid <= 5 && hoeveelheid <= 15) && (toestemming == false) && (gewichtPakket > 0 && gewichtPakket < 25) && (bezorgKosten == false)) {
            bezorgKostenPrijs = 0.0;
        }

        else if((hoeveelheid >= 0 && hoeveelheid <= 4) && (toestemming == true) && (gewichtPakket >= 50) && (bezorgKosten == true)) {
            bezorgKostenPrijs = 10.75;
        }
        else if((hoeveelheid >= 0 && hoeveelheid <= 4) && (toestemming == false) && (gewichtPakket >= 50) && (bezorgKosten == false)) {
            bezorgKostenPrijs = 0.0;
        }

        else if((hoeveelheid <= 5 || hoeveelheid < 15) && (toestemming == true) && (gewichtPakket >= 50) && (bezorgKosten == true)){
            bezorgKostenPrijs = 12.75;
        }
        else if((hoeveelheid <= 5 || hoeveelheid < 15) && (toestemming == false) && (gewichtPakket >= 50) && (bezorgKosten == false)){
            bezorgKostenPrijs = 0.0;
        }

        else if((hoeveelheid >= 15) && (toestemming == true) && (gewichtPakket > 0 && gewichtPakket < 25) && (bezorgKosten == true)){
            bezorgKostenPrijs = 5.50;
        }
        else if((hoeveelheid >= 15) && (toestemming == false) && (gewichtPakket > 0 && gewichtPakket < 25) && (bezorgKosten == false)){
            bezorgKostenPrijs = 0.0;
        }

        else if((hoeveelheid >= 15) && (toestemming == true) && (gewichtPakket >= 50) && (bezorgKosten == true)){
            bezorgKostenPrijs = 9.75;
        }
        else if((hoeveelheid >= 15) && (toestemming == false) && (gewichtPakket >= 50) && (bezorgKosten == false)){
            bezorgKostenPrijs = 0.0;
        }
        return bezorgKostenPrijs;
    }


}