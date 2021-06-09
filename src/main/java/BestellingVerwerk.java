import java.util.ArrayList;
import java.util.Scanner;

public class BestellingVerwerk{

    public static ArrayList<Bestelling> bestellings = new ArrayList();
    Scanner scanner = new Scanner(System.in);

    public void soortBestelling(){
        System.out.println("Wilt u vloeibare schoonmaakmiddelen bestellen? (j/n)");
        String antwoord = scanner.nextLine();
        Product producten;

        if((antwoord.equals("j")) || (antwoord.equals("J"))){
            producten = new Toestemming();
        } else {
            producten = new ZonderToestemming();
        }

        producten.addBestelling();
        System.out.println("Uw bestelling is geplaatst.");
    }

    public ArrayList<Bestelling> getBestellings(){
        return bestellings;
    }
}

