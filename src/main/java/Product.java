import java.util.Scanner;

public abstract class Product {
    private String naam;
    private String goedkeuring;
    private Toestemming toestemming;
    private ZonderToestemming zonderToestemming;
    //Staat gelijk aan friet en soda zodat je method beter kan aanpakken
    //vloeibaar
    //niet vloeibaar
    Scanner scanner = new Scanner(System.in);
    Medewerker medewerker = new Medewerker("Rayshri", 12345, "Intereur");

    public Product (String naam){
        this.naam = naam;
    }

    public abstract String getOrderLine();

    public abstract String getBericht();

    public void addBestelling(){
        System.out.println("Voer een datum in voor uw bestelling: ");
        String datum = scanner.nextLine();
        naam += getOrderLine();
        System.out.println("Voer de prijs in van uw product");
        Double prijs = scanner.nextDouble();
        System.out.println("Voer de hoeveelheid in van uw product: ");
        Integer hoeveelheid = scanner.nextInt();
        scanner.nextLine();
        BestellingVerwerk.bestellings.add(new Bestelling(datum, naam, prijs, hoeveelheid, medewerker.getMedewerkerNaam()));
        System.out.println(getBericht());
    }
}
