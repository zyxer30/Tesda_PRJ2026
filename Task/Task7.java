import java.util.Scanner;

/***
 * Task7.java
 * 
 * Create a program where user inputs two numbers and performs 4 basic arithmetic operations with return types and print the results.
 */

public class Task7 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = num.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = num.nextInt();

        System.out.println("Addition: " + add(num1, num2));
        System.out.println("Subtraction: " + subtract(num1, num2));
        System.out.println("Multiplication: " + multiply(num1, num2));
        System.out.println("Division: " + divide(num1, num2));

        System.out.println();
        num.close();
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(int a, int b) {
        return (double) a / b;
    }
}