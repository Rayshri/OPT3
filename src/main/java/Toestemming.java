import java.util.Scanner;

public class Toestemming extends Product{
    Teamleider teamleider = new Teamleider();
    Scanner scanner = new Scanner(System.in);
    public Toestemming() {
        super( "Let op! Er moet toestemming gevraagd worden. ");
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
        return teamleider.message() + "Er is een bestelling geplaatst door een medewerker, keur deze goed";
    }
}
