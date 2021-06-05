import java.sql.SQLOutput;

class Teamleider {

  BestellingVerwerk BestelV = new BestellingVerwerk();

  public void getBestellingsOverzicht(){
    for(int i = 0; i < BestelV.getBestellings().size(); i++){
      System.out.println("Datum: " + BestelV.getBestellings().get(i).getDatum());
      System.out.println("Naam: " + BestelV.getBestellings().get(i).getNaam());
      System.out.println("Prijs: " + BestelV.getBestellings().get(i).getPrijs());
      System.out.println("Hoeveelheid: " + BestelV.getBestellings().get(i).getHoeveelheid());
      System.out.println("Medewerker: " + BestelV.getBestellings().get(i).getMedewerker());
      System.out.println();
    }
  }

  public void getAantalBestellingen(){
    for(int i = 0; i < BestelV.getBestellings().size(); i++){
      System.out.println("Naam van medewerker: " + BestelV.getBestellings().get(i).getMedewerker() +
              " Aantal bestellingen: " + getAantalMedewerker(BestelV.getBestellings().get(i).getMedewerker()));
      i+=getAantalMedewerker(BestelV.getBestellings().get(i).getMedewerker());
    }
  }

  public int getAantalMedewerker(String empName){
    int aantal = 0;
    for (Bestelling bestel : BestellingVerwerk.bestellings){
      if(bestel.getMedewerker() != null && bestel.getMedewerker().equals(empName)){
        aantal++;
      }
    }
    return aantal;
  }
}
