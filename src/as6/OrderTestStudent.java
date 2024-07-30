package as6;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class OrderTestStudent {
    
    private Order order1;
    private Order order2;
    private Beverage coffee;
    private Beverage smoothie;
    private Beverage alcohol;

    @Before
    public void setUp() throws Exception {
        order1 = new Order();
        order2 = new Order();
        coffee = new Coffee(Size.SMALL);
        smoothie = new Smoothie(Size.MEDIUM);
        alcohol = new Alcohol(Size.LARGE);
    }

    @Test
    public void testConstructor() {
        assertNotNull(order1);
        assertNotNull(order2);
        assertTrue(order1 instanceof Order);
        assertTrue(order2 instanceof Order);
        assertEquals(0, order1.getNumberOfItems());
        assertEquals(0, order2.getNumberOfItems());
    }

    @Test
    public void testAddBeverage() {
        order1.addBeverage(coffee);
        order1.addBeverage(smoothie);
        order1.addBeverage(alcohol);
        
        assertEquals(3, order1.getNumberOfItems());
        assertTrue(order1.getNumberOfItems() == 3);
    }

    @Test
    public void testGetTotal() {
        order1.addBeverage(coffee);
        order1.addBeverage(smoothie);
        order1.addBeverage(alcohol);
        
        double expectedTotal = coffee.calculatePrice() + smoothie.calculatePrice() + alcohol.calculatePrice();
        assertEquals(expectedTotal, order1.getTotal(), 0.01);
    }

    @Test
    public void testGetNumberOfItems() {
        assertEquals(0, order1.getNumberOfItems());
        order1.addBeverage(coffee);
        assertEquals(1, order1.getNumberOfItems());
        order1.addBeverage(smoothie);
        assertEquals(2, order1.getNumberOfItems());
    }

    @Test
    public void testCompareTo() {
        assertTrue(order1.compareTo(order2) < 0 || order1.compareTo(order2) > 0);
        assertEquals(0, order1.compareTo(order1));
    }

    @Test
    public void testToString() {
        assertTrue(order1.toString().contains("Order #"));
        assertTrue(order2.toString().contains("Order #"));
    }
}
