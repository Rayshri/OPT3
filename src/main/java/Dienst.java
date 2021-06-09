public abstract class Dienst {
    private String naam;

    public Dienst(String naam){
        this.naam = naam;
    }

    public abstract int getKortingspercentage();
}
