/*
 * Class: CMSC203 
 * Instructor: Grigoriy Grinberg
 * Description: Stores and provides details about the customer, including their name and age.
 * Due: 07/29/2024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming  
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Afor Njoh_________
*/
package as6;
public class Customer {
    private String name;
    private int age;

    // Constructor
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Customer{name='" + name + "', age=" + age + "}";
    }
}
