/***
 * Task8.java
 * 
 * Write a program featuring an integer variable arguments method. The method should return the sum of all parameters and, for each parameter, the cumulative
 * sum up to that point. For instance, given parameters (4, 5, 10), the program should compute the total for the first parameter, such as 4 = (1+2+3+4), and repeat this
 * process for subsequent parameters.
 */

public class Task8 {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 10};
        int totalSum = sumAndCumulative(numbers);
        System.out.println("Total Sum: " + totalSum);
    }

    public static int sumAndCumulative(int[] values) {
        int total = 0;
        
        for (int value : values) {
            int cumulative = 0;
            System.out.print("Cumulative sum for " + value + " is ");
            for (int i = 1; i <= value; i++) {
                cumulative += i;
                if(i==value)System.out.print( i );
                else System.out.print( i + " + ");
            }
            System.out.println(" = " + cumulative);
            total += value;
        }
        return total;
    }
}
