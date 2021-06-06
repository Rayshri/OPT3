class Medewerker {
    private String medewerkerNaam;
    private Integer medewerkersNr;
    private String dienst;

    public Medewerker(String medewerkerNaam, Integer medewerkersNr, String dienst){
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

    public String getDienst(){
        return dienst;
    }


}