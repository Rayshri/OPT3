public class Interieur extends Dienst{

    public Interieur(){
        super("Interieur");
    }

    @Override
    public int getKortingspercentage() {
        return 5;
    }
}
