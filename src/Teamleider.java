import java.util.ArrayList;

class Teamleider {

  BestellingVerwerk BestelV = new BestellingVerwerk();

  public void getBestellingsOverzicht(){
    for(int i = 0; i < BestelV.bestellings.size(); i++){
      BestelV.bestellings.get(i).getDatum();
    }
  }
}
