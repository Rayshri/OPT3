import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class Toestemming extends Product implements Observer {
    Scanner scanner = new Scanner(System.in);
    public Toestemming() {
        super( "Let op! Er moet toestemming gevraagd worden. ");
        BestellingVerwerk bestellingVerwerk = new BestellingVerwerk();
//        for(Bestelling bestelling : bestellingVerwerk.getBestellings()){
//            bestelling.addObserver();
//
//        }
    }

    @Override
    public String getOrderLine() {
        //let op er moet toestemming gevraagd worden.
        System.out.println("Voer de naam van uw product in: ");
        String product = scanner.nextLine();
         return product;
    }

    @Override
    public String getBericht() {
        return TeamleiderToestemming.message() + "Er is een bestelling geplaatst door een medewerker, keur deze goed";
    }

    @Override
    public void update(Observable o, Object arg) {
        getBericht();
    }
}
