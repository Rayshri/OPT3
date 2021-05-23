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

    @Test
    public void weigerBestelling(){
        assertFalse(bestel.weigerBestelling(3," ", false));
        assertTrue(bestel.weigerBestelling(2, " ", true));
        assertFalse(bestel.weigerBestelling(4, " ", true));
        assertTrue(bestel.weigerBestelling(1, "Apple", false));
        assertFalse(bestel.weigerBestelling(5, "Apple", true));
    }

    @Test
    public void getPrijs(){
        bestel.addProduct(0.00);
        assertEquals(0.00, bestel.getPrijs(), 0.0001);
        bestel.addProduct(10.25);
        assertEquals(10.25, bestel.getPrijs(), 0.0001);
        bestel.addProduct(10.25);
        assertEquals(20.50, bestel.getPrijs(), 0.0001);
        bestel.addProduct(5.50);
        assertEquals(16.50, bestel.getPrijs(), 0.0001);
        bestel.addProduct(5.50);
        assertEquals(22.00, bestel.getPrijs(), 0.0001);
        bestel.addProduct(5.50);
        bestel.addProduct(5.50);
        bestel.addProduct(5.50);
        bestel.addProduct(5.50);
        bestel.addProduct(5.50);
        bestel.addProduct(5.50);
        bestel.addProduct(5.50);
        bestel.addProduct(5.50);
        bestel.addProduct(5.50);
        bestel.addProduct(5.50);
        assertEquals(77.00, bestel.getPrijs(), 0.0001);
        bestel.addProduct(5.50);
        assertEquals(82.50, bestel.getPrijs(), 0.0001);
        bestel.addProduct(4.50);
        assertEquals(72.00, bestel.getPrijs(), 0.0001);
    }
}