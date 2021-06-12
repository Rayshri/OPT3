import java.util.ArrayList;
import java.util.Scanner;

public class BestellingVerwerk{

    public static ArrayList<Bestelling> bestellings = new ArrayList();
    Scanner scanner = new Scanner(System.in);
    Product producten;

    public String soortBestelling(){
        System.out.println("Wilt u vloeibare schoonmaakmiddelen bestellen? (j/n)");
        return scanner.nextLine();
    }

    public void verwerkDetails(){
        String antwoord = soortBestelling();

        if((antwoord.equals("j")) || (antwoord.equals("J"))){
            producten = new Toestemming();
        } else {
            producten = new ZonderToestemming();
        }
    }

    public void plaatsBestelling(){
        verwerkDetails();
        producten.addBestelling();
        System.out.println("Uw bestelling is geplaatst.");
    }

    public ArrayList<Bestelling> getBestellings(){
        return bestellings;
    }
}

