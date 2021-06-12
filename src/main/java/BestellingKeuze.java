import java.util.Scanner;

public class BestellingKeuze {

    BestellingVerwerk bestelV = new BestellingVerwerk();
    Teamleider teamleider = new TeamleiderBestellingen();

    public Integer keuzeVragen(){
        System.out.println("1) Wilt u een bestelling plaatsen?");
        System.out.println("2) Wilt de overzicht zien");
        System.out.println("0) Exit");
        System.out.println("Voer uw keuze in: ");

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void keuze(){
        int keuze = keuzeVragen();
        switch (keuze){
            case 1:
                bestelV.plaatsBestelling();
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
