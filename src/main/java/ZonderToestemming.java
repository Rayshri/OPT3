import java.util.Scanner;

public class ZonderToestemming extends Product{
    Scanner scanner = new Scanner(System.in);
    Teamleider teamleider = new Teamleider();
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
        return teamleider.message() + "Er is een bestelling geplaatst door een medewerker, hiervoor is geen goedkeuring nodig";
    }
}
