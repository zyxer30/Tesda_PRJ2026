package Task15;

// Implement concrete class: Rectangle
public class Rectangle extends AbstractShape {

    // Constructor initializing attributes via super()
    public Rectangle(String color, double length, double width) {
        super(color, length, width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String color() {
        return color;
    }
}
