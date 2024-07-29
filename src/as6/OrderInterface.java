package as6;
public interface OrderInterface {
    void generateOrderNumber();
    void addBeverage(Beverage beverage);
    String toString();
    int compareTo(Order other);
    // Other methods as needed
}
