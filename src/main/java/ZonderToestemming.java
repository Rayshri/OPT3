import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

public class ZonderToestemming extends Product implements Observer {
    Scanner scanner = new Scanner(System.in);
    public ZonderToestemming() {
        super( "Voor deze bestelling heeft u geen toestemming nodig. ");
    }

    @Override
    public String getOrderLine() {
        System.out.println("Voer de naam van uw product in: ");
        String product = scanner.nextLine();
        return product;
    }

    @Override
    public String getBericht() {
        return TeamleiderToestemming.message() + "Er is een bestelling geplaatst door een medewerker, hiervoor is geen goedkeuring nodig";
    }

    @Override
    public void update(Observable o, Object arg) {
        getBericht();
    }
}
