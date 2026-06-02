import java.util.Scanner;

public class LargeNumber {
public static void main(String[] args) {
 Scanner num = new Scanner(System.in);

        System.out.println("enter a 1st number");
        int n_1 = num.nextInt();
        System.out.println("enter a 2nd number");
        int n_2 = num.nextInt();
        System.out.println("enter a 3rd number");
        int n_3 = num.nextInt();

        if (n_1>n_2 && n_1>n_3) {
            System.out.print("Large Number is:"+n_1);
            
        } else if (n_2>n_1 && n_2>n_3) {
            System.out.print("Large Number is:"+n_2);
            
        } else 
            System.out.print("Large Number is:"+n_3);

        System.out.println();
        
        num.close();
            
}
}
