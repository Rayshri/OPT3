import java.util.ArrayList;
import java.util.Scanner;

public class BestellingVerwerk {

    public static ArrayList<Bestelling> bestellings = new ArrayList();
    Scanner scanner = new Scanner(System.in);
    Medewerker medewerker = new Medewerker("Rayshri", 12345, "Intereur");

    public void addBestelling(){
        System.out.println("Voer een datum in voor uw bestelling: ");
        String datum = scanner.nextLine();
        System.out.println("Voer de naam van uw product in: ");
        String product = scanner.nextLine();
        System.out.println("Voer de prijs in van uw product");
        Double prijs = scanner.nextDouble();
        System.out.println("Voer de hoeveelheid in van uw product: ");
        Integer hoeveelheid = scanner.nextInt();
        bestellings.add(new Bestelling(datum, product, prijs, hoeveelheid, medewerker.getMedewerkerNaam()));
        System.out.println("Uw bestelling is geplaatst.");
    }

    public ArrayList<Bestelling> getBestellings(){
        return bestellings;
    }
}

