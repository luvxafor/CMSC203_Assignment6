/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Represents an order containing beverages, calculates the total price, and tracks the number of items.
 * Due: 07/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Afor Njoh_________
*/
package as6;
import java.util.ArrayList;

public class Order implements OrderInterface {
    private static int orderCounter = 1;
    private int orderNumber;
    private ArrayList<Beverage> beverages;

    public Order() {
        this.orderNumber = orderCounter++;
        this.beverages = new ArrayList<>();
    }

    @Override
    public void generateOrderNumber() {
        // Implement order number generation logic
    }

    @Override
    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    @Override
    public String toString() {
        // Implement string representation of the order
        return "Order #" + orderNumber;
    }

    @Override
    public int compareTo(Order other) {
        return Integer.compare(this.orderNumber, other.orderNumber);
    }

    public double getTotal() {
        double total = 0;
        for (Beverage beverage : beverages) {
            total += beverage.calculatePrice();
        }
        return total;
    }
    public int getNumberOfItems() {
        return beverages.size();
    }
}
