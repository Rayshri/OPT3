import org.junit.Test;

import static org.junit.Assert.*;

public class BestellingTest {

    Bestelling bestel = new Bestelling();

    @Test
    public void initTest(){
        bestel.addProduct(0.0);
        assertEquals(0.0, bestel.TotaalPrijs(), 0.0001);
        assertEquals(1, bestel.getHoeveelheid());
    }

    @Test
    public void eersteProductToegevoegd(){
        bestel.addProduct(10.00);
        assertEquals(10.00, bestel.TotaalPrijs(), 0.0001);
        assertEquals(1, bestel.getHoeveelheid());
    }

}