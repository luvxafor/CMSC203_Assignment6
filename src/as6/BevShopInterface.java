package as6;
public interface BevShopInterface {
    void createOrder(Order order);
    void processOrder(Order order);
    double getOrderTotal(Order order);
    int getMonthlyOrderCount();
    double getMonthlySalesTotal();
    // Other methods as needed
}
