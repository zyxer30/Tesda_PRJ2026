import java.util.Scanner;
/***
 * LargeNumber.java
 * 
 * Class name LargeNumber.java
 * Asks the user to input 3 numbers and prints the largest number.
 * 
 *  Enter 1st Number?
 *  10
 *  Enter 2nd Number?
 *  20
 *  Enter 3rd Number?
 *  30
 *  Larger number is 30
 */ 


public class LargeNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter 1st Number?");
        int a = num.nextInt();

        System.out.println("Enter 2nd Number?");
        int b = num.nextInt();

        System.out.println("Enter 3rd Number?");
        int c = num.nextInt();

        if (a>b && a>c) {
            System.out.println("Larger number is " + a);
        } else if (b>a && b>c) {
            System.out.println("Larger number is " + b);
        } else {
            System.out.println("Larger number is " + c);
        }

        System.out.println();
        num.close();

    }

}
