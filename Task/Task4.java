/***
 * Task4.java
 * 
 * Writea program that takes a string as input and checks if it is a palindrome. A palindrome is a word, number, or other sequence of characters that reads the
 * same forward and backward.
 * Your program should perform the following steps;
 * 
 *  * Using StringBuilder to create a new string that is a reverse of the input string.
 *  * Use the equals() method to check if the input string and the reversed string string are the same.
 *  * If the strings are the same, print "The input string is a palindrome." Otherwise, print "The input string is not a palindrome."
 *  * if the strings are not the same, print "The input string is not a palindrome."
 *  
 */
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = input.nextLine();

        StringBuilder reversedStr = new StringBuilder(str).reverse(); 
        
        if (str.toLowerCase().equals(reversedStr.toString().toLowerCase())) {
            System.out.println("The input string is a palindrome.");
        } else {
            System.out.println("The input string is not a palindrome.");
        }

        System.out.println();
        input.close();
    }}
