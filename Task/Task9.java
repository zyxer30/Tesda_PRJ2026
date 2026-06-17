/***
 * Task9.java
 * 
 * Math Operations with Static Import
 * Create a Java program that performs basic math operations (adition, subration, multiplication, division) using static imports for Math class methods. the
 * program should have the following features: Define a class named Task9. Inside the class, create static methods for addition, subraction, multiplication, and
 * division. Each method should take two parameters and return the result. Use static imports for math class metods (Math.addExact(), Math.subtractExact(),
 * Math.multiplyExact(), Math.floorDiv()). in the main method, demonstrate the use of these static methods by performing some math operations with different
 * values. Display the results of each operation.
 * 
 * import stattic java.lang.Math.*;
 * 
 * public clas Task9 {
 * 
 *  public static int add(int a, int b) {
 *     // Your code here
 * }
 * 
 *  public static int subtract(int a, int b) {
 *     // Your code here
 * }
 * 
 *  public static int multiply(int a, int b) {
 *     // Your code here
 * }
 * 
 *  public static int divide(int a, int b) {
 *     // Your code here
 * }
 * 
 *  public static void main(String[] args) {
 *    // Demonstrate the math operations here
 * }
 * 
 */

import static java.lang.Math.*;

import java.util.Scanner;

public class Task9 {

    // Static method for addition
    public static int add(int a, int b) {
        return addExact(a, b);
    }

    // Static method for subtraction
    public static int subtract(int a, int b) {
        return subtractExact(a, b);
    }

    // Static method for multiplication
    public static int multiply(int a, int b) {
        return multiplyExact(a, b);
    }

    // Static method for division
    public static int divide(int a, int b) {
        return floorDiv(a, b);
    }

    public static void main(String[] args) {
       Scanner num = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = num.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = num.nextInt();
        System.out.print("Enter the third number (for floor division): ");
        int num3 = num.nextInt();

        System.out.println("--- Math Operations Demo ---");

        // Demonstrate addition
        int sum = add(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + sum);

        // Demonstrate subtraction
        int difference = subtract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + difference);

        // Demonstrate multiplication
        int product = multiply(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + product);

        // Demonstrate division
        int quotient = divide(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        
        // Demonstrate integer division floor behavior with a negative result
        int floorQuotient = divide(num1, num3);
        System.out.println(num1 + " / " + num3 + " (floored) = " + floorQuotient);

        System.out.println();
        num.close();
    }

}