/***
 * Task13.java
 * 
 * 1. Create a base called Vehicle with the following attributes.
 *  * make (String): The make of the vehicle.
 *  * model (String): The model of the vehicle.
 *  * year (int): The Manufacturing year of the vehicle.
 * 
 * 2. Create a derived class called Cars that extends the Vehicle class. The cars class schould have an additional atrribute:
 *  * numberOfDoors (int) The number of doors in the cars.
 * 
 * 3. Create an instance of the Car clas and set values for its attributes.
 * 4. Implement a method in the Car class called displayDetails() thats prints out the details of the car, including the inherited attributes from the Vehicle class.
 * 
 * Sample output:
 * 
 * Car Details:
 * Make: Toyota
 * Model: Camry
 * Year: 2022
 * Number of Doors: 4
 * 
 */

import Task13.Car;

public class Task13 {
    public static void main(String[] args) {
        // Create an instance of the Car class with the sample values
        Car myCar = new Car("Toyota", "Camry", 2022, 4);

        // Call the method to display details
        myCar.displayDetails();
    }
}