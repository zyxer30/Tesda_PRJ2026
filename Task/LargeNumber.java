import java.util.Scanner;

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
