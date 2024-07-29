/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Abstract base class for all beverages, defining common attributes and methods.
 * Due: 07/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Afor Njoh_________
*/

package as6;
public abstract class Beverage {
    protected String name;
    protected Size size;
    protected double basePrice;

    public Beverage(String name, Size size, double basePrice) {
        this.name = name;
        this.size = size;
        this.basePrice = basePrice;
    }

    public abstract double calculatePrice();
    public abstract String getDescription();

   
}
