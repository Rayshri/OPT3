public abstract class Teamleider{

  BestellingVerwerk BestelV = new BestellingVerwerk();

  public void getBestellingsOverzicht(){
    for(int i = 0; i < BestelV.getBestellings().size(); i++){
      System.out.println("Datum: " + BestelV.getBestellings().get(i).getDatum());
      System.out.println("Naam: " + BestelV.getBestellings().get(i).getNaam());
      System.out.println("Prijs: " + BestelV.getBestellings().get(i).getPrijs());
      System.out.println("Hoeveelheid: " + BestelV.getBestellings().get(i).getHoeveelheid());
      System.out.println("Medewerker: " + BestelV.getBestellings().get(i).getMedewerker());
      System.out.println("Korting: " + BestelV.getBestellings().get(i).getPercentage());
      System.out.println();
    }
  }

  public abstract void getAantalBestellingen();

  public abstract int getAantalMedewerker(String empName);

}
