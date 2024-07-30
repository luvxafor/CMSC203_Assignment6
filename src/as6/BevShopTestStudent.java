package as6;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class BevShopTestStudent {

    private BevShop bevShop;
    private Order order1;
    private Order order2;
    private Beverage coffee;
    private Beverage smoothie;
    private Beverage alcohol;

    @Before
    public void setUp() throws Exception {
        bevShop = new BevShop();
        order1 = new Order();
        order2 = new Order();
        coffee = new Coffee(Size.SMALL);
        smoothie = new Smoothie(Size.MEDIUM);
        alcohol = new Alcohol(Size.LARGE);
        
        order1.addBeverage(coffee);
        order1.addBeverage(smoothie);
        
        order2.addBeverage(alcohol);
    }

    @Test
    public void testCreateOrder() {
        bevShop.createOrder(order1);
        bevShop.createOrder(order2);
        
        assertEquals(2, bevShop.getMonthlyOrderCount());
    }

    @Test
    public void testProcessOrder() {
        // Implement logic in BevShop's processOrder method and test here
        bevShop.processOrder(order1);
        bevShop.processOrder(order2);
        
        // Assuming processOrder marks orders as processed, you can check relevant attributes
        // Here we just call the method to ensure no exceptions are thrown
    }

    @Test
    public void testGetOrderTotal() {
        bevShop.createOrder(order1);
        bevShop.createOrder(order2);

        double expectedTotalOrder1 = coffee.calculatePrice() + smoothie.calculatePrice();
        double expectedTotalOrder2 = alcohol.calculatePrice();
        
        assertEquals(expectedTotalOrder1, bevShop.getOrderTotal(order1), 0.01);
        assertEquals(expectedTotalOrder2, bevShop.getOrderTotal(order2), 0.01);
    }

    @Test
    public void testGetMonthlyOrderCount() {
        assertEquals(0, bevShop.getMonthlyOrderCount());
        
        bevShop.createOrder(order1);
        assertEquals(1, bevShop.getMonthlyOrderCount());
        
        bevShop.createOrder(order2);
        assertEquals(2, bevShop.getMonthlyOrderCount());
    }

    @Test
    public void testGetMonthlySalesTotal() {
        bevShop.createOrder(order1);
        bevShop.createOrder(order2);

        double expectedTotal = coffee.calculatePrice() + smoothie.calculatePrice() + alcohol.calculatePrice();
        assertEquals(expectedTotal, bevShop.getMonthlySalesTotal(), 0.01);
    }
}
