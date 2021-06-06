import java.util.ArrayList;
import java.util.Scanner;

public class BestellingVerwerk {

    public static ArrayList<Bestelling> bestellings = new ArrayList();
    Scanner scanner = new Scanner(System.in);


    public void soortBestelling(){
        //hier komt de onderscheid tussen bleek en doekjes om te bestellen. vervolgens worden de gegevens uit product hier opgeslagen in de array.
        System.out.println("Wilt u vloeibare schoonmaakmiddelen bestellen? (j/n)");
        String antwoord = scanner.nextLine();
        Product producten;

        if((antwoord.equals("j")) || (antwoord.equals("J"))){
            producten = new Toestemming();
        } else {
            producten = new ZonderToestemming();
        }

        //bestellings.add(new Bestelling(datum, product, prijs, hoeveelheid, medewerker.getMedewerkerNaam()));
        producten.addBestelling();
        System.out.println("Uw bestelling is geplaatst.");
    }

    public ArrayList<Bestelling> getBestellings(){
        return bestellings;
    }
}

