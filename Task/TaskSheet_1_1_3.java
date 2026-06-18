/***
 * Task Sheet 1-1-3
 * 
 * Title: Writing Control flow Statements using Loops
 * Performance Objective: Given a function of " (i%2==0) ? 'even' : 'odd' ;", you should be able be to write a program that will
 * check each number if the given numbers are odd or even numbers, print them, and compile it to run in a java virtual
 * machine without errors following Java Standard Edition specification.
 * 
 * Supplies:
 * 
 * Equipment: PC or Laptop
 * 
 * Steps/Procedure:
 * 1. Open your Java IDE and create a java file, name it TaskSheet-1-1-3 or follow the trainer's instructions for online IDE's.
 * 2. Create an int variable and name it check_number with an iniial values of 10.
 * 3. Create a String variable and name it message.
 * 4. Use check_number as a condition on how many loops the program can print.
 * 5. Create a loop that will check and print each number if odd or even numbers using this syntax:
 *      message = (i%2==0) ? i+ " is even number" : i+ " is odd number" ;
 * 6. The next line should print message value.
 * 7. Submit the link of your source code.
 * 
 * Assessment Method: Portfolio Assessment
 * 
 *      1 is odd number
 *      2 is even number
 *      3 is odd number
 *      4 is even number
 *      5 is odd number
 *      6 is even number
 *      7 is odd number
 *      8 is even number
 *      9 is odd number
 *      10 is even number
 *
 */

public class TaskSheet_1_1_3 {
    
    public static void main(String[] args) {
        int check_number = 10;
        String message;

        for (int i = 1; i <= check_number; i++) {
            message = (i % 2 == 0) ? i + " is even number" : i + " is odd number";
            System.out.println(message);
        }
    }
}
