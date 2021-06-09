public class TeamleiderBestellingen extends Teamleider{

    @Override
    public void getAantalBestellingen() {
        for(int i = 0; i < BestelV.getBestellings().size(); i++){
            System.out.println("Naam van medewerker: " + BestelV.getBestellings().get(i).getMedewerker() +
                    " Aantal bestellingen: " + getAantalMedewerker(BestelV.getBestellings().get(i).getMedewerker()));
            i+=getAantalMedewerker(BestelV.getBestellings().get(i).getMedewerker());
        }
    }

    @Override
    public int getAantalMedewerker(String empName) {
        int aantal = 0;
        for (Bestelling bestel : BestellingVerwerk.bestellings){
            if(bestel.getMedewerker() != null && bestel.getMedewerker().equals(empName)){
                aantal++;
            }
        }
        return aantal;
    }
}
