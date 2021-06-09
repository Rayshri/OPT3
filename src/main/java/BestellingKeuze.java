import java.util.Scanner;

public class BestellingKeuze {

    BestellingVerwerk bestelV = new BestellingVerwerk();
    Teamleider teamleider = new TeamleiderBestellingen();

    public void keuze(){
        System.out.println("1) Wilt u een bestelling plaatsen?");
        System.out.println("2) Wilt de overzicht zien");
        System.out.println("0) Exit");
        System.out.println("Voer uw keuze in: ");

        Scanner scanner = new Scanner(System.in);
        Integer keuze = scanner.nextInt();

        switch (keuze){
            case 1:
                bestelV.soortBestelling();
                keuze();
                break;
            case 2:
                teamleider.getBestellingsOverzicht();
                teamleider.getAantalBestellingen();
                keuze();
            case 0:
                System.exit(0);
        }
    }
}
