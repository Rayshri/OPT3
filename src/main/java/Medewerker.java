class Medewerker {
    private String medewerkerNaam;
    private Integer medewerkersNr;
    private Dienst dienst;

    public Medewerker(String medewerkerNaam, Integer medewerkersNr, Dienst dienst){
        this.medewerkerNaam = medewerkerNaam;
        this.medewerkersNr = medewerkersNr;
        this.dienst = dienst;
    }

    public String getMedewerkerNaam(){
        return medewerkerNaam;
    }

    public Integer getMedewerkersNr(){
        return medewerkersNr;
    }

    public Integer getKortingsPercentage(){
        return dienst.getKortingspercentage();
    }


}