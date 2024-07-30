package as6;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import as6.Alcohol;
import as6.Size;

public class AlcoholTestStudent {

    private Alcohol smallAlcohol;
    private Alcohol mediumAlcohol;
    private Alcohol largeAlcohol;

    @Before
    public void setUp() throws Exception {
        smallAlcohol = new Alcohol(Size.SMALL);
        mediumAlcohol = new Alcohol(Size.MEDIUM);
        largeAlcohol = new Alcohol(Size.LARGE);
    }

    @Test
    public void testConstructor() {
        assertNotNull(smallAlcohol);
        assertNotNull(mediumAlcohol);
        assertNotNull(largeAlcohol);
    }

    @Test
    public void testGetDescription() {
        assertEquals("Alcohol (SMALL)", smallAlcohol.getDescription());
        assertEquals("Alcohol (MEDIUM)", mediumAlcohol.getDescription());
        assertEquals("Alcohol (LARGE)", largeAlcohol.getDescription());
    }

    @Test
    public void testCalculatePrice() {
        assertEquals(5.00, smallAlcohol.calculatePrice(), 0.01);
        assertEquals(5.00, mediumAlcohol.calculatePrice(), 0.01);
        assertEquals(5.00, largeAlcohol.calculatePrice(), 0.01);
    }

   
}
