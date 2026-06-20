import java.util.Scanner;
public class logical_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Using logical AND operator to check the condition
        if ((a + b == c) && (c > 0 || c <= 0)) {
            System.out.println(c + " is the sum of " + a + " and " + b + ".");
        } else {
            System.out.println(c + " is NOT the sum of " + a + " and " + b + ".");
        }

        sc.close();
    }
}
 