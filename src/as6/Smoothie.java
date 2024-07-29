/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Represents a smoothie beverage with specific pricing and attributes.
 * Due: 07/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Afor Njoh_________
*/
package as6;;
public class Smoothie extends Beverage {
    private static final double BASE_PRICE = 4.00; // example base price

    public Smoothie(Size size) {
        super("Smoothie", size, BASE_PRICE);
    }

    @Override
    public double calculatePrice() {
        // implement price calculation based on size and add-ons
        return basePrice;
    }

    @Override
    public String getDescription() {
        return "Smoothie (" + size + ")";
    }
}
