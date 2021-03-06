class Bestelling {
    private String naam;
    private double prijs;
    private String datum;
    private Integer hoeveelheid = 0;
    private Medewerker medewerker;
    private Dienst dienst;

     public Bestelling(String datum, String naam, double prijs, Integer hoeveelheid, Medewerker medewerker){
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
        return prijs;
    }

    public int getHoeveelheid(){
        return hoeveelheid;
    }

    public String getDatum(){
        return datum;
    }

    public String getMedewerker(){
        return medewerker.getMedewerkerNaam();
    }

    public int getPercentage(){
         return medewerker.getKortingsPercentage();
    }
}
