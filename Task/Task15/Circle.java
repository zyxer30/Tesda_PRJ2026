package Task15;

// Implement concrete class: Circle
public class Circle extends AbstractShape {
    private double radius;

    // Constructor initializing common attributes via super() and local radius
    public Circle(String color, double radius) {
        super(color, 0, 0); 
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String color() {
        return color;
    }
}
