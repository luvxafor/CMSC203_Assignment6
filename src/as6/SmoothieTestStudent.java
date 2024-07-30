package as6;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import as6.Size;
import as6.Smoothie;

public class SmoothieTestStudent {

    private Smoothie smallSmoothie;
    private Smoothie mediumSmoothie;
    private Smoothie largeSmoothie;

    @Before
    public void setUp() throws Exception {
        smallSmoothie = new Smoothie(Size.SMALL);
        mediumSmoothie = new Smoothie(Size.MEDIUM);
        largeSmoothie = new Smoothie(Size.LARGE);
    }

  

    @Test
    public void testCalculatePrice() {
        assertEquals(4.00, smallSmoothie.calculatePrice(), 0.01);
        assertEquals(4.00, mediumSmoothie.calculatePrice(), 0.01);
        assertEquals(4.00, largeSmoothie.calculatePrice(), 0.01);
    }

    @Test
    public void testGetDescription() {
        assertEquals("Smoothie (SMALL)", smallSmoothie.getDescription());
        assertEquals("Smoothie (MEDIUM)", mediumSmoothie.getDescription());
        assertEquals("Smoothie (LARGE)", largeSmoothie.getDescription());
    }
}
