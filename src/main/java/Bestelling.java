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
    private String medewerker;

     public Bestelling(String datum, String naam, double prijs, Integer hoeveelheid, String medewerker){
         //this.minimaleProduct = 3;
         this.datum = datum;
         this.naam = naam;
         this.prijs = prijs;
         this.hoeveelheid = hoeveelheid;
         this.medewerker = medewerker;
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

//        if (getHoeveelheid() < 3 && getHoeveelheid() > 0) {
//            prijs = getHoeveelheid() * 10.25;
//        }
//        else if (getHoeveelheid() >= 3 && getHoeveelheid() < 15) {
//            prijs = getHoeveelheid() * 5.50;
//        }
//        else if (getHoeveelheid() >= 15) {
//            prijs = getHoeveelheid() * 4.50;
//        }

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
        hoeveelheid++;
    }

    public String getDatum(){
        return datum;
    }

    public String getMedewerker(){
        return medewerker;
    }

    public String getBedrijfNaam(){
        return bedrijfNaam;
    }

    public Integer getGewichtPakket() {
        return gewichtPakket;
    }
    public double TotaalPrijs(){
        return totaal;
    }

    public boolean weigerBestelling(int hoeveelheid, String bedrijfNaam, boolean toestemming){
        return ((bedrijfNaam.isEmpty() && toestemming) || ( hoeveelheid < minimaleProduct));
    }

    public double getBezorgKosten(int hoeveelheid, boolean toestemming, int gewichtPakket, boolean bezorgKosten) {
        if(toestemming && bezorgKosten) {
                if(hoeveelheid >= 0 && hoeveelheid <=4) {
                    bezorgKostenPrijs = 7.50;
                } else if(hoeveelheid >= 5 && hoeveelheid < 15){
                    bezorgKostenPrijs = 5.00;
                } else if(hoeveelheid >= 15){
                    bezorgKostenPrijs = 3.50;
                }
                    if(gewichtPakket > 0 && gewichtPakket < 25){
                        bezorgKostenPrijs += 1.00;
                    } else if(gewichtPakket >= 25){
                        bezorgKostenPrijs += 2.50;
                    }
            } else {
            bezorgKostenPrijs = 0.00;
        }
     return bezorgKostenPrijs;
    }
}
