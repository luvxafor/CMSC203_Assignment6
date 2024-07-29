
/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Main class to demonstrate order processing, manage user interactions, and display order details.
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
import java.util.List;
import java.util.Scanner;

public class BevShopDriverApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BevShop shop = new BevShop();
        List<Order> allOrders = new ArrayList<>();
        
        int orderNumber = 0;
        double secondOrderTotalPrice = 0.0; // to store the total price of the second order

        while (true) {
            orderNumber++;
            System.out.println("The current order in process can have at most 3 alcoholic beverages.");
            System.out.println("The minimum age to order alcohol drink is 21.");
            
            System.out.println("Start please a new order:");
            Order currentOrder = new Order();
            
            // get customer details
            System.out.print("Would you please enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Would you please enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());
            
            Customer customer = new Customer(name, age);
            System.out.println(customer);
            
            System.out.println("Your age is " + age + " and you are " + (age >= 21 ? "eligible" : "not eligible") + " to order alcohol.");
            
            int alcoholCount = 0;
            if (age >= 21) {
                while (alcoholCount < 3) {
                    System.out.print("Would you please add an alcohol drink? (yes/no): ");
                    String addAlcohol = scanner.nextLine();
                    
                    if (addAlcohol.equalsIgnoreCase("yes")) {
                        Beverage alcohol = new Alcohol(Size.MEDIUM); // sssuming medium size for simplicity
                        currentOrder.addBeverage(alcohol);
                        alcoholCount++;
                        System.out.println("The current order of drinks is " + alcoholCount);
                        System.out.println("The Total Price on the Order: " + currentOrder.getTotal());
                    } else {
                        break;
                    }
                }
                
                if (alcoholCount >= 3) {
                    System.out.println("You have reached the maximum alcohol drinks for this order.");
                }

                // allow adding coffee if alcohol can be ordered
                System.out.print("Would you please add a COFFEE to your order? (yes/no): ");
                String addCoffee = scanner.nextLine();
                
                if (addCoffee.equalsIgnoreCase("yes")) {
                    Beverage coffee = new Coffee(Size.SMALL); // assuming small size for simplicity
                    currentOrder.addBeverage(coffee);
                }
            } else {
                System.out.println("You are not permitted to order alcohol.");

                // allow adding smoothies and coffee if alcohol cannot be ordered
                System.out.print("Would you please add a SMOOTHIE to your order? (yes/no): ");
                String addSmoothie = scanner.nextLine();
                
                if (addSmoothie.equalsIgnoreCase("yes")) {
                    Beverage smoothie = new Smoothie(Size.MEDIUM); // assuming medium size for simplicity
                    currentOrder.addBeverage(smoothie);
                }

                System.out.print("Would you please add a COFFEE to your order? (yes/no): ");
                String addCoffee = scanner.nextLine();
                
                if (addCoffee.equalsIgnoreCase("yes")) {
                    Beverage coffee = new Coffee(Size.SMALL); // assuming small size for simplicity
                    currentOrder.addBeverage(coffee);
                }
            }

            System.out.println("Total items on your order is " + currentOrder.getNumberOfItems());
            System.out.println("The Total Price on the Order: " + currentOrder.getTotal());
            shop.createOrder(currentOrder);
            allOrders.add(currentOrder);
            
            // display the total price of the second order if it exists
            if (orderNumber == 2) {
                secondOrderTotalPrice = currentOrder.getTotal();
                System.out.println("Total price on the second Order: " + secondOrderTotalPrice);
            }
            
            // display the total amount for all orders after processing the second order
            if (orderNumber == 2) {
                double totalAmount = shop.getMonthlySalesTotal();
                System.out.println("Total amount for all Orders: " + totalAmount);
            }
            
            System.out.println("#------------------------------------#");
            
            System.out.print("Would you please start a new order? (yes/no): ");
            String startNewOrder = scanner.nextLine();
            
            if (startNewOrder.equalsIgnoreCase("no")) {
                break;
            }
        }
        
        // display the total amount for all orders if user chose to exit
        double totalAmount = shop.getMonthlySalesTotal();
        System.out.println("Total amount for all Orders: " + totalAmount);
        
        scanner.close();
    }
}
