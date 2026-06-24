import Task15.Shape;
import Task15.Circle;
import Task15.Rectangle;


// Main class to run the program
public class Task15 {
    public static void main(String[] args) {
        // Create instances of Circle and Rectangle
        Shape myCircle = new Circle("Red", 5.0);
        Shape myRectangle = new Rectangle("Blue", 4.0, 6.0);

        // Display results for Circle
        System.out.println("--- Circle Properties ---");
        System.out.println("Color: " + myCircle.color());
        System.out.printf("Area: %.2f%n", myCircle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", myCircle.calculatePerimeter());

        System.out.println();

        // Display results for Rectangle
        System.out.println("--- Rectangle Properties ---");
        System.out.println("Color: " + myRectangle.color());
        System.out.printf("Area: %.2f%n", myRectangle.calculateArea());
        System.out.printf("Perimeter: %.2f%n", myRectangle.calculatePerimeter());
    }
}
