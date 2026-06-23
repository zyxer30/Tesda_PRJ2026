package Task13;

public class Car extends Vehicle {
    // Additional attribute
    int numberOfDoors;

    // Constructor
    public Car(String make, String model, int year, int numberOfDoors) {
        // Pass the base attributes to the parent (Vehicle) constructor
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    // Method to display all details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }
}