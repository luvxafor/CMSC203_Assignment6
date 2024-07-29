
/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Manages beverage orders, processes transactions, and generates monthly sales reports.
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

public class BevShop implements BevShopInterface {
    private ArrayList<Order> orders;

    public BevShop() {
        this.orders = new ArrayList<>();
    }

    @Override
    public void createOrder(Order order) {
        orders.add(order);
    }

    @Override
    public void processOrder(Order order) {
        // implement order processing logic
    }

    @Override
    public double getOrderTotal(Order order) {
        return order.getTotal();
    }

    @Override
    public int getMonthlyOrderCount() {
        return orders.size();
    }

    @Override
    public double getMonthlySalesTotal() {
        double total = 0;
        for (Order order : orders) {
            total += order.getTotal();
        }
        return total;
    }

   
}
