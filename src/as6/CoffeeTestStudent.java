package as6;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CoffeeTestStudent {
    Coffee smallCoffee;
    Coffee mediumCoffee;
    Coffee largeCoffee;

    @Before
    public void setUp() throws Exception {
        smallCoffee = new Coffee(Size.SMALL);
        mediumCoffee = new Coffee(Size.MEDIUM);
        largeCoffee = new Coffee(Size.LARGE);
    }

    @After
    public void tearDown() throws Exception {
        smallCoffee = mediumCoffee = largeCoffee = null;
    }

    @Test
    public void testConstructor() {
        // Testing the constructor
        assertNotNull(smallCoffee);
        assertNotNull(mediumCoffee);
        assertNotNull(largeCoffee);
    }

    @Test
    public void testCalculatePrice() {
        // Assuming base price is 3.00 and the price changes with size
        // Modify these prices based on the actual implementation of calculatePrice()
        assertEquals(3.00, smallCoffee.calculatePrice(), 0.01);
        assertEquals(3.00, mediumCoffee.calculatePrice(), 0.01);
        assertEquals(3.00, largeCoffee.calculatePrice(), 0.01);
    }

    @Test
    public void testGetDescription() {
        // Testing getDescription method
        assertEquals("Coffee (SMALL)", smallCoffee.getDescription());
        assertEquals("Coffee (MEDIUM)", mediumCoffee.getDescription());
        assertEquals("Coffee (LARGE)", largeCoffee.getDescription());
    }

    // Add more tests if you have additional methods or functionality to test
}
