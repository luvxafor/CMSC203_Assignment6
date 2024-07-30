package as6;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CustomerTestStudent {

    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("John Doe", 25);
    }

    @Test
    public void testConstructor() {
        assertNotNull(customer);
        assertEquals("John Doe", customer.getName());
        assertEquals(25, customer.getAge());
    }

    @Test
    public void testGetName() {
        assertEquals("John Doe", customer.getName());
    }

    @Test
    public void testSetName() {
        customer.setName("Jane Doe");
        assertEquals("Jane Doe", customer.getName());
    }

    @Test
    public void testGetAge() {
        assertEquals(25, customer.getAge());
    }

    @Test
    public void testSetAge() {
        customer.setAge(30);
        assertEquals(30, customer.getAge());
    }

    @Test
    public void testToString() {
        assertEquals("Customer{name='John Doe', age=25}", customer.toString());
        customer.setName("Jane Doe");
        customer.setAge(30);
        assertEquals("Customer{name='Jane Doe', age=30}", customer.toString());
    }
}
